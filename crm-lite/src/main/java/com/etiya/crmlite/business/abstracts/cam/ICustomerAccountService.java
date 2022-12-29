package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.requests.cam.customerAccounts.CreateCustomerAccountRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccounts.GetAllCustomerAccountResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccounts.GetByIdCustomerAccountResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.entities.concretes.cam.Cust;

import java.util.List;

public interface ICustomerAccountService {
    public void addCustomerAccountForCreateCustomer(Cust cust);

    DataResult<List<GetAllCustomerAccountResponse>> getAll();

    DataResult<GetByIdCustomerAccountResponse> getById(Long id);

    Result add(CreateCustomerAccountRequest createCustomerAccountRequest);

    Result delete(Long customerAccountId);

    Result update(Long customerAccountId,CreateCustomerAccountRequest createCustomerAccountRequest);

    DataResult<List<GetAllCustomerAccountResponse>> getAllForCustomerGetAll();
}
