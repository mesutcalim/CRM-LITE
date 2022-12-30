package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountProductInvolvementService;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.CreateCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.DeleteCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccountProductInvolvements.UpdateCustomerAccountProductInvolvementRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetAllCustomerAccountProductInvolvementResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetByIdCustomerAccountProductInvolvementResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cam/customerAccountProductInvolvements")
@AllArgsConstructor
public class CustomerAccountProductInvolvementController {
    private ICustomerAccountProductInvolvementService customerAccountProductInvolvementService;

    @PostMapping("/add")
    public Result add(@RequestBody CreateCustomerAccountProductInvolvementRequest createCustomerAccountProductInvolvementRequest) {
        return this.customerAccountProductInvolvementService.add(createCustomerAccountProductInvolvementRequest);
    }
    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteCustomerAccountProductInvolvementRequest deleteCustomerAccountProductInvolvementRequest) {
        return this.customerAccountProductInvolvementService.delete(deleteCustomerAccountProductInvolvementRequest);
    }

    @PostMapping("/update")
    public Result update(@RequestBody UpdateCustomerAccountProductInvolvementRequest updateCustomerAccountProductInvolvementRequest) {
        return this.customerAccountProductInvolvementService.update(updateCustomerAccountProductInvolvementRequest);
    }
    @GetMapping("/getbyid")
    public DataResult<GetByIdCustomerAccountProductInvolvementResponse> getById(@RequestParam Long id) {
        return this.customerAccountProductInvolvementService.getById(id);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllCustomerAccountProductInvolvementResponse>> getAll() {
        return this.customerAccountProductInvolvementService.getAll();
    }


    @GetMapping("/getactiveproductsofcustomer")
    public Result getActiveProductsOfCustomer(@RequestParam Long customerId){
        return this.customerAccountProductInvolvementService.getActiveProductsCustomer(customerId);
    }

    @GetMapping("/getactiveproductsofcustomeraccount")
    public DataResult<List<GetByIdCustomerAccountProductInvolvementResponse>> getActiveProductOfCustomerAccount(@RequestParam Long customerAccountId){
        return this.customerAccountProductInvolvementService.getActiveProductsOfBillingAccount(customerAccountId);
    }
}
