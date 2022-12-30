package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountService;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccounts.CreateCustomerAccountRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customerAccounts.UpdateCustomerAccountRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccounts.GetAllCustomerAccountResponse;
import com.etiya.crmlite.business.dtos.responses.cam.customerAccounts.GetByIdCustomerAccountResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cam/customerAccounts")
@AllArgsConstructor
public class CustomerAccountController {
    private ICustomerAccountService customerAccountService;

    @GetMapping("/getall")
    public DataResult<List<GetAllCustomerAccountResponse>> getAll() {
        return customerAccountService.getAll();
    }
    @GetMapping("/getbyid")
    public DataResult<GetByIdCustomerAccountResponse> getById(@RequestParam Long id) {
        return customerAccountService.getById(id);
    }
    @PostMapping("/add")
    public Result add(@RequestBody CreateCustomerAccountRequest createCustomerAccountRequest) {
        return customerAccountService.add(createCustomerAccountRequest);
    }
    @PostMapping("/delete")
    public Result delete(@RequestParam("custAccountId") Long customerAccountId) {
        return customerAccountService.delete(customerAccountId);
    }
    @PostMapping("/update")
    public Result update(@RequestBody UpdateCustomerAccountRequest updateCustomerAccountRequest) {
        return customerAccountService.update(updateCustomerAccountRequest.getCustomerAccountId(),updateCustomerAccountRequest);
    }

}
