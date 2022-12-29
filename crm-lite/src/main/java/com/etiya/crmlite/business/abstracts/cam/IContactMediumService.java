package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.CreateContactMediumRequest;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.entities.concretes.cam.CntcMedium;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.entities.concretes.cam.Cust;

import javax.transaction.Transactional;

public interface IContactMediumService {
    Result add(CreateContactMediumRequest createContactMediumRequest);
    //todo:Kullanıcı, kontakt bilgilerinin girildiği ekranda aşağıdaki alanları doldurabilecektir:
    // Email (zorunlu alan)
    // Home/Office Phone
    // Mobile Phone (zorunlu alan)
    // Fax


    void addContactMediumPhoneForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);


    void addContactMediumEmailForCreateCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);


    void addHomePhoneForIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);


    void addFaxForIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest, Cust cust);
    void addContactMediumForIndividual(CntcMedium cntcMedium);
}
