package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.dtos.requests.cam.customerAccounts.UpdateCustomerAccountRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccounts.GetAllCustomerAccountResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccounts.GetByIdCustomerAccountResponse;
import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountService;
import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccounts.CreateCustomerAccountRequest;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.core.util.results.SuccessResult;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.entities.concretes.cam.CustAcct;
import com.etiya.crmlite.repositories.cam.ICustomerAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerAccountManager implements ICustomerAccountService {
    private ICustomerAccountRepository customerAccountRepository;
    private ICustomerService customerService;

    @Override
    public DataResult<List<GetAllCustomerAccountResponse>> getAll() {
        List<CustAcct> result = this.customerAccountRepository.findAll();
        List<GetAllCustomerAccountResponse> response = result.stream().map(custAcct -> GetAllCustomerAccountResponse.builder()
                .customerAccountId(custAcct.getCustAcctId())
                .accountName(custAcct.getAccountName())
                .statusId(custAcct.getStId())
                .accountNo(custAcct.getAcctNo())
                .accountTypeId(custAcct.getAcctTpId())
                .build()
        ).collect(Collectors.toList());

        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByIdCustomerAccountResponse> getById(Long id) {
        CustAcct result = this.customerAccountRepository.findById(id).get();
        GetByIdCustomerAccountResponse response= GetByIdCustomerAccountResponse.builder()
                .customerAccountId(result.getCustAcctId())
                .accountName(result.getAccountName())
                .statusId(result.getStId())
                .accountNo(result.getAcctNo())
                .accountTypeId(result.getAcctTpId())
                .build();
        return new SuccessDataResult<>(response);
    }
    @Override
    public Result add(CreateCustomerAccountRequest createCustomerAccountRequest) {
        Cust cust= this.customerService.getByCustomerId(createCustomerAccountRequest.getCustomerId());
        CustAcct custAcct = CustAcct.builder()
                .acctNo(createCustomerAccountRequest.getCustomerId().toString())
                .accountName("Müşteri Hesabı")
                .stId(164L)
                .acctTpId(223L)
                .cust(cust)
                .build();
        this.customerAccountRepository.save(custAcct);
        return new SuccessResult("CUSTOMER.DEFAULT.ACCOUNT.ADDED");
    }
    @Override
    public Result delete(Long customerAccountId) {
        CustAcct custAcct= this.customerAccountRepository.findById(customerAccountId).get();
        custAcct = CustAcct.builder()
                .stId(170L)
                .build();
        custAcct.setCDate(this.customerAccountRepository.getReferenceById(custAcct.getCustAcctId()).getCDate());

        this.customerAccountRepository.save(custAcct);
        return new SuccessResult("CUSTOMER.ACCOUNT.DELETED");
    }

    @Override
    public Result update(Long customerAccountId, UpdateCustomerAccountRequest updateCustomerAccountRequest) {
        CustAcct custAcct = customerAccountRepository.findById(customerAccountId).orElseThrow();
        Cust cust= custAcct.getCust();
        custAcct = CustAcct.builder()
                .custAcctId(custAcct.getCustAcctId())
                .acctNo(updateCustomerAccountRequest.getAccountNo())
                .accountName(updateCustomerAccountRequest.getAccountName())
                .stId(updateCustomerAccountRequest.getStatusId())
                .acctTpId(updateCustomerAccountRequest.getAccountTypeId())
                .cust(cust)
                .build();

        custAcct.setCDate(this.customerAccountRepository.getReferenceById(updateCustomerAccountRequest.getCustomerAccountId()).getCDate());

        this.customerAccountRepository.save(custAcct);
        return new SuccessResult("CUSTOMER.ACCOUNT.UPDATED");
    }

    @Override
    public void addCustomerAccountForCreateCustomer(Cust cust) {
        CustAcct custAcct = CustAcct.builder()
                .acctNo(cust.getCustId().toString())
                .accountName("Müşteri Hesabı")
                .stId(164L)
                .acctTpId(223L)
                .cust(cust)
                .build();
        this.customerAccountRepository.save(custAcct);

        CustAcct custAcct1 = custAcct;

        custAcct1.setAcctNo(custAcct.getCustAcctId().toString());

        this.customerAccountRepository.save(custAcct1);

    }



    @Override
    public DataResult<List<GetAllCustomerAccountResponse>> getAllForCustomerGetAll() {
        List<CustAcct> result = this.customerAccountRepository.findAll();
        List<GetAllCustomerAccountResponse> response = result.stream().map(custAcct -> GetAllCustomerAccountResponse.builder()
                .customerAccountId(custAcct.getCustAcctId())
                .accountName(custAcct.getAccountName())
                .statusId(custAcct.getStId())
                .accountNo(custAcct.getAcctNo())
                .accountTypeId(custAcct.getAcctTpId())
                .build()
        ).collect(Collectors.toList());

        return new SuccessDataResult<>(response);
    }

    @Override
    public CustAcct getByCustomerAccountId(Long id) {
        CustAcct custAcct= this.customerAccountRepository.findById(id).get();
        return custAcct;
    }
}
