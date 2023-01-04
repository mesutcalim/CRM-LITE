package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CreateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CustomerAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CustomerUpdateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.UpdateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateAddressForIndividualRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllAddressResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllCustomerAddressesResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetByCustomerUpdateAddressResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetByIdAddressResponse;
import com.etiya.crmlite.business.abstracts.cam.IAddressService;
import com.etiya.crmlite.core.util.exceptions.BusinessException;
import com.etiya.crmlite.core.util.mapper.ModelMapperService;
import com.etiya.crmlite.core.util.message.IMessageService;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.core.util.results.SuccessResult;
import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.entities.concretes.cam.Party;
import com.etiya.crmlite.repositories.cam.IAddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AddressManager implements IAddressService {
    private IAddressRepository addressRepository;
    private ICustomerService customerService;
    private MessageSource messageSource;
    private IMessageService messageService;

    @Override
    public DataResult<List<GetAllAddressResponse>> getAll() {
        List<Addr> result = this.addressRepository.findAll();
        List<GetAllAddressResponse> response = result.stream().map(addr -> GetAllAddressResponse.builder()
                .addressId(addr.getAddrId())
                .addressDescription(addr.getAddrDesc())
                .buildingId(addr.getBldgId())
                .cityName(addr.getCityName())
                .countryName(addr.getCntryName())
                .streetId(addr.getStrtId())
                .streetName(addr.getStrtName())
                .build()
        ).collect(Collectors.toList());
        return new SuccessDataResult<>(messageService.Messages("SUCCESS"),response);
    }

    @Override
    public Page<GetAllAddressResponse> getAllWithPage(Pageable pageable) {
        return   addressRepository.getAllWithPage(pageable);
    }


    @Override
    public DataResult<GetByIdAddressResponse> getById(Long id) {
        Addr result= this.addressRepository.findById(id).orElseThrow();
        GetByIdAddressResponse response = GetByIdAddressResponse.builder()
                .addressId(result.getAddrId())
                .addressDescription(result.getAddrDesc())
                .buildingId(result.getBldgId())
                .cityName(result.getCityName())
                .countryName(result.getCntryName())
                .streetId(result.getStrtId())
                .streetName(result.getStrtName())
                .build();
        return new SuccessDataResult<>(messageService.Messages("GET.ADDRESS"),response);
    }
    @Override
    public DataResult<Addr> addAddress(CreateAddressRequest createAddressRequest) {
        Addr addr = new Addr().builder()
                .rowId(createAddressRequest.getRowId())
                .dataTypeId(createAddressRequest.getDataTypeId())
                .strtId(createAddressRequest.getStreetId())
                .bldgId(createAddressRequest.getBuildingId())
                .addrDesc(createAddressRequest.getAddressDescription())
                .isActv(createAddressRequest.getIsActive())
                .cityName(createAddressRequest.getCityName())
                .strtName(createAddressRequest.getStreetName())
                .bldgName(createAddressRequest.getBuildingName())
                .cntryName(createAddressRequest.getCountryName())
                .build();
        Addr response =addressRepository.save(addr);


        return new SuccessDataResult("ADDRESS.ADDED",response);
    }
    @Override
    public SuccessDataResult deleteAddress(Long address_id) {
        Addr addr = addressRepository.findById(address_id).orElseThrow();

        addr.setIsActv(0);

        addr.setCDate(addressRepository.getReferenceById(addr.getAddrId()).getCDate());//Create date güncellenmesin diye esti cdate set edildi.

        this.addressRepository.save(addr);
        return new SuccessDataResult("ADDRESS.DELETED");
    }

//    @Override
//    public DataResult<Addr> updateAddress(int address_id) {
////        CreateAddressRequest addr = CreateAddressRequest.builder()
////                .addressDescription()
////                .cityName()
////                .countryName()
////                .isActive(1)
////                .buildingId()
////                .streetId()
////                .buildingName()
////                .streetName()
////                .dataTypeId(9L)
////                .rowId()
////                .build();
////        this.addAddress(addr);
//        return null;
//    }


    @Override
    public Result updateAddress(Long address_id, UpdateAddressRequest updateAddressRequest) {
        Addr address= addressRepository.findById(address_id).orElseThrow();
        address = Addr.builder()
                .addrId(address.getAddrId())
                .rowId(address.getRowId())
                .dataTypeId(address.getDataTypeId())
                .strtId(updateAddressRequest.getStreetId())
                .bldgId(updateAddressRequest.getBuildingId())
                .addrDesc(updateAddressRequest.getAddressDescription())
                .isActv(updateAddressRequest.getIsActive())
                .cityName(updateAddressRequest.getCityName())
                .strtName(updateAddressRequest.getStreetName())
                .bldgName(updateAddressRequest.getBuildingName())
                .cntryName(updateAddressRequest.getCountryName())
                .build();
        //setCdate yapılacak unutma //Yapıldı
        address.setCDate(this.addressRepository.getReferenceById(updateAddressRequest.getAddressId()).getCDate());

        this.addressRepository.save(address);
        return new SuccessResult("ADDRESS.UPDATED");

    }

    @Override
    public void addAddressForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust) {
        Party party = cust.getPartyRole().getParty();

        List<CreateAddressForIndividualRequest> addressRequests = createIndividualCustomerRequest.getCreateAddressForIndividualRequests();

        for (CreateAddressForIndividualRequest addressRequest:addressRequests) {

            CreateAddressRequest addr = CreateAddressRequest.builder()
                    .addressDescription(addressRequest.getAddressDescription())
                    .cityName(addressRequest.getCityName())
                    .countryName(addressRequest.getCountryName())
                    .isActive(1)
                    .buildingId(addressRequest.getBuildingId())
                    .streetId(addressRequest.getStreetId())
                    .buildingName(addressRequest.getBuildingName())
                    .streetName(addressRequest.getStreetName())
                    .dataTypeId(9L)
                    .rowId(party.getPartyId())
                    .build();
            this.addAddress(addr);
        }

    }

    @Override
    public DataResult<GetByCustomerUpdateAddressResponse> customerUpdateAddress(CustomerUpdateAddressRequest customerUpdateAddressRequest, Pageable pageable) {
        Cust cust = customerService.getByCustomerId(customerUpdateAddressRequest.getCustomerId());
        Party party = cust.getPartyRole().getParty();
        Addr result = getByAdressId(customerUpdateAddressRequest.getAddressId());


        Addr addr =Addr.builder()
                .addrId(result.getAddrId())
                .rowId(party.getPartyId())
                .isActv(result.getIsActv())
                .dataTypeId(result.getDataTypeId())
                .addrDesc(customerUpdateAddressRequest.getAddressDescription())
                .cityName(customerUpdateAddressRequest.getCityName())
                .strtName(customerUpdateAddressRequest.getStreetName())
                .bldgName(customerUpdateAddressRequest.getBuildingName())
                .cntryName(customerUpdateAddressRequest.getBuildingName())
                .strtId(customerUpdateAddressRequest.getStreetId())
                .bldgId(customerUpdateAddressRequest.getBuildingId())
                .build();

        addr.setCUser(result.getCUser());
        addr.setCDate(result.getCDate());

        add(addr);

        GetByCustomerUpdateAddressResponse response  = GetByCustomerUpdateAddressResponse.builder()
                .addressId(result.getAddrId())
                .customerId(cust.getCustId())
                .build();


        return new SuccessDataResult<>("SUCCESS.UPDATE.CUSTOMER.ADDRESS",response);
    }

    private void add(Addr addr) {
        addressRepository.save(addr);
    }

    private Addr getByAdressId(Long addressId) {
        return addressRepository.findById(addressId).orElseThrow(()-> {
            throw new BusinessException(messageService.Messages("ADDRESS.NOT.EXIST"));
        });
    }

    @Override
    public DataResult<List<GetAllCustomerAddressesResponse>> getAllCustomerAddresses(CustomerAddressRequest customerAddressRequest) {
        List<Addr> result = this.addressRepository.findAll();
        List<GetAllCustomerAddressesResponse> response = result.stream().map(addr -> GetAllCustomerAddressesResponse.builder()
                .addressId(addr.getAddrId())
                .addressDescription(addr.getAddrDesc())
                .buildingId(addr.getBldgId())
                .cityName(addr.getCityName())
                .countryName(addr.getCntryName())
                .streetId(addr.getStrtId())
                .streetName(addr.getStrtName())
                .build()
        ).collect(Collectors.toList());
        return new SuccessDataResult<>("SUCCESS",response);
    }
}
