package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.business.abstracts.cam.IIndividualService;
import com.etiya.crmlite.business.abstracts.cam.IPartyRoleService;
import com.etiya.crmlite.business.abstracts.cam.IPartyService;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.core.util.exceptions.BusinessException;
import com.etiya.crmlite.core.util.mapper.ModelMapperService;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.core.util.results.SuccessResult;
import com.etiya.crmlite.entities.concretes.cam.*;
import com.etiya.crmlite.business.abstracts.cam.*;
import com.etiya.crmlite.repositories.cam.IIndividualRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class IndividualManager implements IIndividualService {
    private IIndividualRepository individualRepository;
    private ModelMapperService modelMapperService;
    private ICustomerService customerService;
    private IPartyRoleService partyRoleService;
    private IPartyService partyService;
    private IContactMediumService contactMediumService;
    private ICustomerAccountService customerAccountService;
    private IAddressService addressService;


//    @Override
//    public Result addIndividual(CreateIndividualCustomerRequest createIndividualCustomerRequest) {
//        checkIfNationalityIdExists(createIndividualCustomerRequest.getNationalityId());
//        Ind ind= Ind.builder()
//                .frstName(createIndividualCustomerRequest.getFirstName())
//                .mName(createIndividualCustomerRequest.getMiddleName())
//                .lstName(createIndividualCustomerRequest.getLastName())
//                .brthDate(createIndividualCustomerRequest.getBirthDate())
//                .genderId(createIndividualCustomerRequest.getGenderId())
//                .mthrName(createIndividualCustomerRequest.getMotherName())
//                .fthrName(createIndividualCustomerRequest.getFatherName())
//                .natId(createIndividualCustomerRequest.getNationalityId())
//                .stId(157L)
//                .party(addNewCustomer().getPartyRole().getParty())
//                .build();
//        this.individualRepository.save(ind);
//
////        FindCustomerResponse response = modelMapperService.getMapperforResponse()
////                .map(savedCust,FindCustomerResponse.class);
//        return new SuccessDataResult("Müşteri başarı ile eklendi!");
//    }

    @Override
    @Transactional
    public Result addIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest) throws Exception {

        checkIfNationalityIdExists(createIndividualCustomerRequest.getNationalityId());
        Cust customerAdd = addNewCustomer();


        // create for Ind
        Ind ind = Ind.builder()
                .frstName(createIndividualCustomerRequest.getFirstName())
                .lstName(createIndividualCustomerRequest.getLastName())
                .mName(createIndividualCustomerRequest.getMiddleName())
                .brthDate(createIndividualCustomerRequest.getBirthDate())
                .fthrName(createIndividualCustomerRequest.getFatherName())
                .mthrName(createIndividualCustomerRequest.getMotherName())
                .genderId(createIndividualCustomerRequest.getGenderId())
                .stId(157L)
                .natId(createIndividualCustomerRequest.getNationalityId())
                .party(customerAdd.getPartyRole().getParty())
                .build();
        this.individualRepository.save(ind);

        this.addressService.addAddressForCreateCustomer(createIndividualCustomerRequest,customerAdd);

        this.contactMediumService.addContactMediumPhoneForCreateCustomer(createIndividualCustomerRequest,customerAdd);
        this.contactMediumService.addContactMediumEmailForCreateCustomer(createIndividualCustomerRequest,customerAdd);
        if (createIndividualCustomerRequest.getFax() != null){
            this.contactMediumService.addFaxForIndividualCustomer(createIndividualCustomerRequest,customerAdd);
        }

        if (createIndividualCustomerRequest.getHomePhone() != null){
            this.contactMediumService.addHomePhoneForIndividualCustomer(createIndividualCustomerRequest,customerAdd);
        }

        this.customerAccountService.addCustomerAccountForCreateCustomer(customerAdd);


        return new SuccessResult("INDIVIDUAL.CUSTOMER.ADDED");
    }

    private Cust addNewCustomer() {
        PartyRole partyRole = addNewPartyRole();
        CustTp custTp = CustTp.builder()
                .custTpId(10001L)
                .build();
        Cust cust = Cust.builder()
                .custTp(custTp)
                .partyRole(partyRole)
                .stId(83L)
                .build();
        this.customerService.addNewCustomerFromIndividual(cust);
        return cust;
    }

    private PartyRole addNewPartyRole() {
        PartyRoleTp partyRoleTp = PartyRoleTp.builder()
                .partyRoleTpId(1001L)
                .build();
        Party party = addNewParty();
        PartyRole partyRole = PartyRole.builder()
                .party(party)
                .partyRoleTp(partyRoleTp)
                .stId(80L)
                .build();
        this.partyRoleService.addPartyRoleFromIndividual(partyRole);
        return partyRole;
    }

    private Party addNewParty() {
        Party party = Party.builder()
                .partyTpId(164L)
                .stId(17L)
                .build();
        this.partyService.addPartyFromIndividual(party);
        return party;
    }

    private void checkIfNationalityIdExists(Long nationalityId){
        Ind currentIndividual = this.individualRepository.findByNatId(nationalityId);
        if (currentIndividual != null){
            throw new BusinessException("A customer is already exist with this Nationality ID");
        }
    }


}
