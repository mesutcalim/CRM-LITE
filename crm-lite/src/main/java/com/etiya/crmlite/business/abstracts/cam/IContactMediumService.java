package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.CreateContactMediumRequest;
import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.UpdateContactMediumRequest;
import com.etiya.crmlite.business.dtos.responses.cam.contactMediums.GetAllContactMediumResponse;
import com.etiya.crmlite.business.dtos.responses.cam.contactMediums.GetByIdContactMediumResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.entities.concretes.cam.CntcMedium;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.entities.concretes.cam.Cust;

import javax.transaction.Transactional;
import java.util.List;

public interface IContactMediumService {
    DataResult<List<GetAllContactMediumResponse>> getAll();
    DataResult<GetByIdContactMediumResponse> getById(Long id);
    Result add(CreateContactMediumRequest createContactMediumRequest);
    //todo:Kullanıcı, kontakt bilgilerinin girildiği ekranda aşağıdaki alanları doldurabilecektir:
    // Email (zorunlu alan)
    // Home/Office Phone
    // Mobile Phone (zorunlu alan)
    // Fax
    Result update(UpdateContactMediumRequest updateContactMediumRequest);

    Result delete(Long contactMediumId);


    void addContactMediumPhoneForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);


    void addContactMediumEmailForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);


    void addHomePhoneForIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);


    void addFaxForIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);
    void addContactMediumForIndividual(CntcMedium cntcMedium);
}
