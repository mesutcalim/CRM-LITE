package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.core.util.results.Result;

public interface IIndividualService {
    // Result addIndividual(CreateIndividualCustomerRequest createIndividualCustomerRequest);
    Result addIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest) throws Exception;
}
