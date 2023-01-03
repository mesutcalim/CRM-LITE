package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.business.dtos.requests.cam.customers.CreateCustomerRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customers.UpdateCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customers.GetAllCustomerResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customers.GetByIdCustomerResponse;
import com.etiya.crmlite.business.abstracts.cam.ICustomerTypeService;
import com.etiya.crmlite.business.abstracts.cam.IPartyRoleService;

import com.etiya.crmlite.core.util.exceptions.BusinessException;
import com.etiya.crmlite.core.util.generalCodes.GeneralStatusCodes;
import com.etiya.crmlite.core.util.mapper.ModelMapperService;
import com.etiya.crmlite.core.util.results.*;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.entities.concretes.cam.CustTp;
import com.etiya.crmlite.entities.concretes.cam.PartyRole;
import com.etiya.crmlite.repositories.cam.ICustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerManager implements ICustomerService {

    private ICustomerRepository customerRepository;
    private ModelMapperService modelMapperService;
    private ICustomerTypeService customerTypeService;
    private IPartyRoleService partyRoleService;
//    private ICustomerAccountService customerAccountService;

    @Override
    public Result add(CreateCustomerRequest createCustomerRequest) {
        PartyRole partyRole = PartyRole.builder().partyRoleId(createCustomerRequest.getPartyRoleId()).build();
        CustTp custTp = CustTp.builder().custTpId(createCustomerRequest.getCustomerTypeId()).build();
        Cust cust = Cust.builder()
                .custTp(custTp)
                .partyRole(partyRole)
                .stId(GeneralStatusCodes.CUST_ACTV)
                .build();
        if(checkNatId(cust)){
        this.customerRepository.save(cust);
        return new SuccessResult("CUSTOMER.ADDED");}
        else{
            throw new BusinessException("A customer is already exist with this NatID");
        }
    }
    //todo:Buraya Eğer benzer bir kayıt bulunduysa kullanıcıya “A customer is already exist with this NatID”
    // uyarı mesajı gösteren fonksiyon yazılmalıdır.

    public DataResult<List<FindCustomerResponse>> getCustomersByFilter(Long customerId,
                                                                       String firstName,
                                                                       String lastName,
                                                                       Long natId,
                                                                       String gsmNumber,
                                                                       Long customerOrderId,
                                                                       String accountNumber) {
        List<FindCustomerResponse> results = customerRepository.getCustomersByFilter(customerId, firstName, lastName, natId,gsmNumber, customerOrderId, accountNumber);
        results.stream().map(result -> FindCustomerResponse.builder()
                .custId(result.getCustId())
                .frstName(result.getFrstName())
                .lstName(result.getLstName())
                .natId(result.getNatId())
                .partyRoleName(result.getPartyRoleName())
                .mName(result.getMName())).collect(Collectors.toList());

        return new SuccessDataResult<List<FindCustomerResponse>>("başarılı",results);
    }





    public Result updateCustomer(UpdateCustomerRequest updateCustomerRequest) {
        CustTp custTp= this.customerTypeService.getByCustomerTypeId(updateCustomerRequest.getCustomerTypeId());
        PartyRole partyRole = this.partyRoleService.getByPartyRoleId(updateCustomerRequest.getPartyRoleId());
        Cust cust = Cust.builder()
                .custId(updateCustomerRequest.getCustomerId())
                .stId(updateCustomerRequest.getStatusId())
                .custTp(custTp)
                .partyRole(partyRole)
                .build();

        //cust.setCDate(cust.getCDate());//CDate korunmalı
        cust.setCDate(this.customerRepository.getReferenceById(updateCustomerRequest.getCustomerId()).getCDate());
        //cust.setCUser(8L);

        this.customerRepository.save(cust);
        return new SuccessResult("CUSTOMER.UPDATED");
    }

    @Override
    public Result deleteCust(Long cust_id) {
        Cust customer = customerRepository.findById(cust_id).orElseThrow();

//        if(canBeDeleted(customer)) {
            customer.setStId(GeneralStatusCodes.CUST_PASS);
            customerRepository.save(customer);
            customer.setCDate(this.customerRepository.getReferenceById(cust_id).getCDate());
            return new SuccessResult("Müşteri başarı ile silindi.");
//        } else{
//            return new ErrorResult("Since the customer has active products, the customer cannot be deleted.");
//        }

    }
    @Override
    public DataResult<List<GetAllCustomerResponse>> getAll() {
        List<Cust> result = this.customerRepository.findAll();
        List<GetAllCustomerResponse> response = result.stream().map(cust-> GetAllCustomerResponse.builder()
                .customerId(cust.getCustId())
                .statusId(cust.getStId())
                .partyRoleId(cust.getPartyRole().getPartyRoleId())
                .build()
        ).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByIdCustomerResponse> getById(Long id) {
        Cust result= this.customerRepository.findById(id).get();
        GetByIdCustomerResponse response = GetByIdCustomerResponse.builder()
                .customerId(result.getCustId())
                .statusId(result.getStId())
                .partyRoleId(result.getPartyRole().getPartyRoleId())
                .build();
        return new SuccessDataResult<>(response);
    }



    @Override
    public void addNewCustomerFromIndividual(Cust cust) {
        this.customerRepository.save(cust);
    }

    @Override
    public Cust getByCustomerId(Long id) {
        Cust cust= this.customerRepository.findById(id).get();
        return cust;
    }

//    @Override
//    public DataResult<Page<Cust>> findAll(Pageable pageable) {
//        return new SuccessDataResult<>("Başarıyla sayfalandı.",customerRepository.findAll(pageable));
//    //return new SuccessDataResult<>(customerRepository.findAll(pageable), messageSource.getMessage(Message.Address.getAllPageable,null,
//        //                LocaleContextHolder.getLocale()));
//    }

    private boolean checkNatId(Cust cust){
        Cust custExist = null;
        custExist = customerRepository.findById(cust.getCustId()).orElseThrow();
        if(custExist == null)
            return true;
        else
            return false;
    }
    //Üstteki fonskiyonun alternatifi
    //    private void customerCanNotExistWithSameNatId(Long natId){
//        boolean isExists = customerRepository.existsCustByNatId(natId);
//        if(isExists){
//            throw new BusinessException("“A customer is already exist with this NatID");
//
//        }
//    }

//    private boolean canBeDeleted(Cust cust){
//
//        if( customerRepository.checkActiveProduct(cust.getCustId()).isEmpty())
//        {
//            return true;//silinebilir
//        }else {
//            return false;
//        }
//    }


}


