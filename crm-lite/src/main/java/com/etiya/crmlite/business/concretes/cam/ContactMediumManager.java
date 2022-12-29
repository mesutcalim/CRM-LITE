package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IContactMediumService;
import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.CreateContactMediumRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessResult;
import com.etiya.crmlite.entities.concretes.cam.CntcMedium;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.repositories.cam.IContactMediumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ContactMediumManager implements IContactMediumService {

    private IContactMediumRepository contactMediumRepository;
    @Override
    public Result add(CreateContactMediumRequest createContactMediumRequest) {
        CntcMedium cntcMedium = CntcMedium.builder()
                .rowId(createContactMediumRequest.getRowId())
                .dataTpId(createContactMediumRequest.getDataTypeId())
                .cntcData(createContactMediumRequest.getContactData())
                .stId(createContactMediumRequest.getStatusId())
                .cntcMediumTpId(createContactMediumRequest.getContactMediumTypeId())
                .build();
        this.contactMediumRepository.save(cntcMedium);
        return new SuccessResult("CONTACT.MEDIUM.ADDED");
    }

    @Override
    @Transactional
    public void addContactMediumPhoneForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust) {
        //for phone
        CntcMedium contactMediumPhone = CntcMedium.builder()
                .rowId(cust.getPartyRole().getParty().getPartyId())
                .dataTpId(9L)
                .cntcData(createIndividualCustomerRequest.getPhone())
                .stId(110L)
                .cntcMediumTpId(172L)
                .build();
        addContactMediumForIndividual(contactMediumPhone);

    }

    @Override
    public void addContactMediumEmailForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust) {
        // for email
        CntcMedium contactMediumEmail = CntcMedium.builder()
                .rowId(cust.getPartyRole().getParty().getPartyId())
                .dataTpId(9L)
                .cntcData(createIndividualCustomerRequest.getEmail())
                .stId(110L)
                .cntcMediumTpId(173L)
                .build();
        addContactMediumForIndividual(contactMediumEmail);
    }

    @Override
    public void addHomePhoneForIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust) {
        CntcMedium contactMediumHomePhone = CntcMedium.builder()
                .rowId(cust.getPartyRole().getParty().getPartyId())
                .dataTpId(9L)
                .cntcData(createIndividualCustomerRequest.getHomePhone())
                .stId(110L)
                .cntcMediumTpId(170L)
                .build();
        this.addContactMediumForIndividual(contactMediumHomePhone);
    }

    @Override
    public void addFaxForIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust) {
        CntcMedium contactMediumFax = CntcMedium.builder()
                .rowId(cust.getPartyRole().getParty().getPartyId())
                .dataTpId(9L)
                .cntcData(createIndividualCustomerRequest.getFax())
                .stId(110L)
                .cntcMediumTpId(171L)
                .build();
        this.addContactMediumForIndividual(contactMediumFax);
    }


    @Override
    public void addContactMediumForIndividual(CntcMedium cntcMedium) {
        this.contactMediumRepository.save(cntcMedium);
    }
}
