package com.etiya.crmlite.business.concretes.cam;

import com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetAllCustomerAccountProductInvolvementResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetByIdCustomerAccountProductInvolvementResponse;
import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountProductInvolvementService;
import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountService;
import com.etiya.crmlite.business.abstracts.prod.IProductService;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.CreateCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.DeleteCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.UpdateCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.core.util.exceptions.BusinessException;
import com.etiya.crmlite.core.util.generalCodes.GeneralStatusCodes;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.core.util.results.SuccessResult;
import com.etiya.crmlite.entities.concretes.cam.CustAcct;
import com.etiya.crmlite.entities.concretes.cam.CustAcctProdInvl;
import com.etiya.crmlite.entities.concretes.product.Prod;
import com.etiya.crmlite.repositories.cam.ICustomerAccountProductInvolvementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerAccountProductInvolvementManager implements ICustomerAccountProductInvolvementService {
    private ICustomerAccountProductInvolvementRepository customerAccountProductInvolvementRepository;
    private ICustomerAccountService customerAccountService;
    private IProductService productService;

    @Override
    public DataResult<List<GetAllCustomerAccountProductInvolvementResponse>> getAll() {
        List<CustAcctProdInvl> result = this.customerAccountProductInvolvementRepository.findAll();
        List<GetAllCustomerAccountProductInvolvementResponse> response = result.stream().map(custAcctProdInvl -> GetAllCustomerAccountProductInvolvementResponse.builder()
                .customerAccountProductInvolvementId(custAcctProdInvl.getCustAcctProdInvlId())
                .statusId(custAcctProdInvl.getStId())
                .shortCode(custAcctProdInvl.getShrtCode())
                .build()
        ).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByIdCustomerAccountProductInvolvementResponse> getById(Long id) {
        CustAcctProdInvl result = this.customerAccountProductInvolvementRepository.findById(id).get();
        GetByIdCustomerAccountProductInvolvementResponse response = GetByIdCustomerAccountProductInvolvementResponse.builder()
                .customerAccountProductInvolvementId(result.getCustAcctProdInvlId())
                .statusId(result.getStId())
                .shortCode(result.getShrtCode())
                .build();
        return new SuccessDataResult<>(response);
    }

    @Override
    public Result add(CreateCustomerAccountProductInvolvementRequest createCustomerAccountProductInvolvementRequest) {
        CustAcct custAcct= this.customerAccountService.getByCustomerAccountId(createCustomerAccountProductInvolvementRequest.getCustomerAccountId());
        Prod prod =this.productService.getByProductId(createCustomerAccountProductInvolvementRequest.getProductId());
        CustAcctProdInvl custAcctProdInvl = CustAcctProdInvl.builder()
                .shrtCode(createCustomerAccountProductInvolvementRequest.getShortCode())
                .stId(createCustomerAccountProductInvolvementRequest.getStatusId())
                .prod(prod)
                .custAcct(custAcct)
                .build();
        this.customerAccountProductInvolvementRepository.save(custAcctProdInvl);
        return new SuccessResult("CUSTOMER.ACCOUNT.PRODUCT.INVOLVEMENT.ADDED");
    }

    @Override
    public Result delete(DeleteCustomerAccountProductInvolvementRequest deleteCustomerAccountProductInvolvementRequest) {
        CustAcctProdInvl customerAccountProductInvolvement = this.customerAccountProductInvolvementRepository.findById(deleteCustomerAccountProductInvolvementRequest.getCustomerAccountProductInvolvementId()).get();
        CustAcct custAcct = CustAcct.builder().custAcctId(customerAccountProductInvolvement.getCustAcct().getCustAcctId()).build();
        checkIfCustomersProductStatus(custAcct.getCustAcctId());
        Prod prod = Prod.builder().prodId(customerAccountProductInvolvement.getProd().getProdId()).build();
        CustAcctProdInvl custAcctProdInvl = CustAcctProdInvl.builder()
                .custAcctProdInvlId(customerAccountProductInvolvement.getCustAcctProdInvlId())
                .shrtCode(customerAccountProductInvolvement.getShrtCode())
                .stId(9009L)
                .prod(prod)
                .custAcct(custAcct)
                .build();
        this.customerAccountProductInvolvementRepository.save(custAcctProdInvl);
        return new SuccessResult("CUSTOMER.ACCOUNT.PRODUCT.INVOLVEMENT.DELETED");
    }

    @Override
    public Result update(UpdateCustomerAccountProductInvolvementRequest updateCustomerAccountProductInvolvementRequest) {
        CustAcct custAcct= this.customerAccountService.getByCustomerAccountId(updateCustomerAccountProductInvolvementRequest.getCustomerAccountId());
        Prod prod =this.productService.getByProductId(updateCustomerAccountProductInvolvementRequest.getProductId());
        CustAcctProdInvl custAcctProdInvl = CustAcctProdInvl.builder()
                .custAcctProdInvlId(updateCustomerAccountProductInvolvementRequest.getCustomerAccountProductInvolvementId())
                .shrtCode(updateCustomerAccountProductInvolvementRequest.getShortCode())
                .stId(updateCustomerAccountProductInvolvementRequest.getStatusId())
                .prod(prod)
                .custAcct(custAcct)
                .build();
        this.customerAccountProductInvolvementRepository.save(custAcctProdInvl);
        return new SuccessResult("CUSTOMER.ACCOUNT.PRODUCT.INVOLVEMENT.UPDATED");
    }

    @Override
    public CustAcctProdInvl save(CustAcctProdInvl custAcctProdInvl) {
        return this.customerAccountProductInvolvementRepository.save(custAcctProdInvl);
    }

    @Override
    public DataResult<List<GetByIdCustomerAccountProductInvolvementResponse>> getActiveProductsCustomer(Long customerId) {
        checkIfActiveProductsOfCustomer(customerId);

        List<GetByIdCustomerAccountProductInvolvementResponse> result=this.customerAccountProductInvolvementRepository.
                getActiveProductsOfCustomer(customerId);

        return new SuccessDataResult<>("Customer.Account.Linked.Active.Products.Listed",result);
    }

    @Override
    public DataResult<List<GetByIdCustomerAccountProductInvolvementResponse>> getActiveProductsOfBillingAccount(Long customerAccountId) {
        checkIfActiveProductsOfBillingAccount(customerAccountId);

        List<GetByIdCustomerAccountProductInvolvementResponse> result = this.customerAccountProductInvolvementRepository.
                getActiveProductsOfBillingAccount(customerAccountId);



        return new SuccessDataResult<>("Customer.Account.Linked.Active.Products.Listed",result);
    }

    @Override
    public void checkIfCustomersProductStatus(Long customerAccountId) {
        List<CustAcctProdInvl> results = this.customerAccountProductInvolvementRepository.findByCustAcctCustAcctId(customerAccountId);

        for(CustAcctProdInvl item :results){
            if(item.getStId()== GeneralStatusCodes.CUST_ACCT_PROD_INVL_ACTV) {
                throw new BusinessException("Since the customer has active products, the customer cannot be deleted.");
            }
        }
    }

    private void checkIfActiveProductsOfCustomer(Long customerId){
        List<GetByIdCustomerAccountProductInvolvementResponse> result=this.customerAccountProductInvolvementRepository
                .getActiveProductsOfCustomer(customerId);

        if (result.size()>0){
            throw new BusinessException("Since the customer has active products, the customer cannot be deleted.");
        }
    }

    private void checkIfActiveProductsOfBillingAccount(Long customerAccountId){
        List<GetByIdCustomerAccountProductInvolvementResponse> result = this.customerAccountProductInvolvementRepository.getActiveProductsOfBillingAccount(customerAccountId);

        if (result.size()>0){
            throw new BusinessException("Since the customer has active products, the customer cannot be deleted.");
        }
    }
}
