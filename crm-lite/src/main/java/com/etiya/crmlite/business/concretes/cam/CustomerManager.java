package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.dtos.requests.cam.customers.CreateCustomerRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customers.FindCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.core.util.mapper.ModelMapperService;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.repositories.cam.ICustomerRepository;

import java.util.List;

public class CustomerManager implements ICustomerService {

    private ICustomerRepository customerRepository;
    private ModelMapperService modelMapperService;

    public DataResult<List<FindCustomerResponse>> getCustomersByFilter(FindCustomerRequest findCustomerRequest) {
        List<FindCustomerResponse> result = this.customerRepository.getCustomersByFilter(
                findCustomerRequest.getCustomerId(),
                findCustomerRequest.getFirstName(),
                findCustomerRequest.getLastName(),
                findCustomerRequest.getNatId(),
                findCustomerRequest.getGsmNumber(),
                findCustomerRequest.getCustomerOrderId(),
                findCustomerRequest.getAccountNo());

        return new SuccessDataResult<>(result);
    }
    @Override
    public Result addCustomer(CreateCustomerRequest createCustomerRequest) {
        Cust customer = modelMapperService.getMapperforRequest().map(createCustomerRequest,Cust.class);
        Cust savedCust = customerRepository.save(customer);

//        FindCustomerResponse response = modelMapperService.getMapperforResponse()
//                .map(savedCust,FindCustomerResponse.class);
        return new SuccessDataResult("Müşteri başarı ile eklendi!");
    }

    //todo:Buraya Eğer benzer bir kayıt bulunduysa kullanıcıya “A customer is already exist with this NatID”
    // uyarı mesajı gösteren fonksiyon yazılmalıdır.


    @Override
    public Cust updateCust(Long cust_id) {
        return null;
    }

    @Override
    public void deleteCust(Long cust_id) {

    }
}


