package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualRequest;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.UpdateIndividualRequest;
import com.etiya.crmlite.business.dtos.responses.cam.individuals.GetAllIndividualResponse;
import com.etiya.crmlite.business.dtos.responses.cam.individuals.GetByIdIndividualResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;

import java.util.List;

public interface IIndividualService {
    // Result addIndividual(CreateIndividualCustomerRequest createIndividualCustomerRequest);
    Result addIndividualCustomer(CreateIndividualCustomerRequest createIndividualCustomerRequest) throws Exception;

    DataResult<List<GetAllIndividualResponse>> getAll();
    Result delete(Long indId);

    Result update(UpdateIndividualRequest updateIndividualRequest) throws Exception;

    DataResult<GetByIdIndividualResponse> getById(Long id);

    public Result add(CreateIndividualRequest createIndividualRequest);


}
