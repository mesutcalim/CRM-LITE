package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IAddressService;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CreateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.UpdateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customers.CreateCustomerRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateAddressForIndividualRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.core.util.mapper.ModelMapperService;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.core.util.results.SuccessResult;
import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.entities.concretes.cam.Party;
import com.etiya.crmlite.repositories.cam.IAddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressManager implements IAddressService {
    private IAddressRepository addressRepository;
    private ModelMapperService modelMapperService;
    @Override
    public Result addAddress(CreateAddressRequest createAddressRequest) {
        Addr addr = new Addr().builder()
                .rowId(createAddressRequest.getRowId())
                .dataTpId(createAddressRequest.getDataTypeId())
                .strtId(createAddressRequest.getStreetId())
                .bldgId(createAddressRequest.getBuildingId())
                .addrDesc(createAddressRequest.getAddressDescription())
                .isActv(createAddressRequest.getIsActive())
                .cityName(createAddressRequest.getCityName())
                .strtName(createAddressRequest.getStreetName())
                .bldgName(createAddressRequest.getBuildingName())
                .cntryName(createAddressRequest.getCountryName())
                .build();
        addressRepository.save(addr);

        return new SuccessDataResult("Adres başarı ile eklendi!");
    }
    @Override
    public Result deleteAddress(Long address_id) {
        Addr addr = addressRepository.findById(address_id).orElseThrow();

        addr.setIsActv(0);

        addr.setCDate(addressRepository.getReferenceById(addr.getAddrId()).getCDate());//Create date güncellenmesin diye esti cdate set edildi.

        this.addressRepository.save(addr);
        return new SuccessDataResult("Adres başarı ile silindi!");
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
                .dataTpId(address.getDataTpId())
                .strtId(updateAddressRequest.getStreetId())
                .bldgId(updateAddressRequest.getBuildingId())
                .addrDesc(updateAddressRequest.getAddressDescription())
                .isActv(updateAddressRequest.getIsActive())
                .cityName(updateAddressRequest.getCityName())
                .strtName(updateAddressRequest.getStreetName())
                .bldgName(updateAddressRequest.getBuildingName())
                .cntryName(updateAddressRequest.getCountryName())
                .build();
        //setCdate yapılacak unutma!!!
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


}
