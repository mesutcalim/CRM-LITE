package com.etiya.crmlite.business.abstracts.cam;

import com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetAllCustomerAccountProductInvolvementResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetByIdCustomerAccountProductInvolvementResponse;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.CreateCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.DeleteCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.UpdateCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.entities.concretes.cam.CustAcctProdInvl;

import java.util.List;

public interface ICustomerAccountProductInvolvementService {

    DataResult<List<GetAllCustomerAccountProductInvolvementResponse>> getAll();
    DataResult<GetByIdCustomerAccountProductInvolvementResponse> getById(Long id);
    Result add(CreateCustomerAccountProductInvolvementRequest createCustomerAccountProductInvolvementRequest);
    Result delete(DeleteCustomerAccountProductInvolvementRequest deleteCustomerAccountProductInvolvementRequest);
    Result update(UpdateCustomerAccountProductInvolvementRequest updateCustomerAccountProductInvolvementRequest);
    CustAcctProdInvl save(CustAcctProdInvl custAcctProdInvl);
    DataResult<List<GetByIdCustomerAccountProductInvolvementResponse>>getActiveProductsCustomer(Long customerId);
    DataResult<List<GetByIdCustomerAccountProductInvolvementResponse>>getActiveProductsOfBillingAccount(Long customerAccountId);
    void checkIfCustomersProductStatus(Long customerAccountId);
}
