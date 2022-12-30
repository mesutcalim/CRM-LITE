package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.abstracts.cam.IContactMediumService;
import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.CreateContactMediumRequest;
import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.UpdateContactMediumRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.contactMediums.GetAllContactMediumResponse;
import com.etiya.crmlite.business.dtos.responses.cam.contactMediums.GetByIdContactMediumResponse;
import com.etiya.crmlite.core.util.generalCodes.GeneralStatusCodes;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.core.util.results.SuccessResult;
import com.etiya.crmlite.entities.concretes.cam.CntcMedium;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.repositories.cam.IContactMediumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ContactMediumManager implements IContactMediumService {

    private IContactMediumRepository contactMediumRepository;

    @Override
    public DataResult<List<GetAllContactMediumResponse>> getAll() {
        List<CntcMedium> result = this.contactMediumRepository.findAll();
        List<GetAllContactMediumResponse> response = result.stream().map(cntcMedium -> GetAllContactMediumResponse.builder()
                .contactMediumId(cntcMedium.getCntcMediumId())
                .contactMediumTypeId(cntcMedium.getCntcMediumTpId())
                .contactData(cntcMedium.getCntcData())
                .dataTypeId(cntcMedium.getDataTpId())
                .rowId(cntcMedium.getRowId())
                .statusId(cntcMedium.getStId())
                .build()
        ).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByIdContactMediumResponse> getById(Long id) {
        CntcMedium result = this.contactMediumRepository.findById(id).get();
        GetByIdContactMediumResponse response = GetByIdContactMediumResponse.builder()
                .contactMediumId(result.getCntcMediumId())
                .contactMediumTypeId(result.getCntcMediumTpId())
                .contactData(result.getCntcData())
                .dataTypeId(result.getDataTpId())
                .rowId(result.getRowId())
                .statusId(result.getStId())
                .build();
        return new SuccessDataResult<>(response);
    }
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
    public Result delete(Long contactMediumId) {
        CntcMedium cntcMedium = this.contactMediumRepository.findById(contactMediumId).orElseThrow();
        cntcMedium = CntcMedium.builder()
                .cntcMediumId(cntcMedium.getCntcMediumId())
                .rowId(cntcMedium.getRowId())
                .cntcData(cntcMedium.getCntcData())
                .dataTpId(cntcMedium.getDataTpId())
                .stId(GeneralStatusCodes.CNTC_MEDIUM_DEL)
                .cntcMediumTpId(cntcMedium.getCntcMediumTpId())
                .build();

        cntcMedium.setCDate(this.contactMediumRepository.getReferenceById(cntcMedium.getCntcMediumId()).getCDate());

        this.contactMediumRepository.save(cntcMedium);
        return new SuccessResult("CONTACT.MEDIUM.DELETED");

    }


    @Override
    public Result update(UpdateContactMediumRequest updateContactMediumRequest) {
        CntcMedium cntcMedium = this.contactMediumRepository.findById(updateContactMediumRequest.getContactMediumId()).get();
        cntcMedium = CntcMedium.builder()
                .cntcMediumId(cntcMedium.getCntcMediumId())
                .rowId(cntcMedium.getRowId())
                .dataTpId(cntcMedium.getDataTpId())
                .cntcData(updateContactMediumRequest.getContactData())
                .stId(updateContactMediumRequest.getStatusId())
                .cntcMediumTpId(updateContactMediumRequest.getContactMediumTypeId())
                .build();

        cntcMedium.setCDate(this.contactMediumRepository.getReferenceById(updateContactMediumRequest.getContactMediumId()).getCDate());
        this.contactMediumRepository.save(cntcMedium);
        return new SuccessResult("CONTACT.MEDIUM.UPDATED");
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
