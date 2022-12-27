package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.business.dtos.requests.cam.customers.CreateCustomerRequest;
import com.etiya.crmlite.business.dtos.requests.cam.customers.FindCustomerRequest;
import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cam/customers")
@AllArgsConstructor
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<Result> addCustomer(@RequestBody CreateCustomerRequest createCustomerRequest){
        return new ResponseEntity<>(customerService.addCustomer(createCustomerRequest), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Result> updateCustomer(@RequestParam Long customerId, @RequestBody FindCustomerRequest findCustomerRequest){
        return new ResponseEntity<>(customerService.updateCust(customerId,findCustomerRequest),HttpStatus.OK);
    }

    @PostMapping("/delete")
    public Result deleteCustomer(@RequestParam Long customerId){
        return customerService.deleteCust(customerId);
    }

    @GetMapping("/getCustomerByFilter")
    public DataResult<List<FindCustomerResponse>> getCustomerByFilter(
            @RequestParam(value = "nationalId" , required = false) Long natId,
            @RequestParam(value = "customerId" , required = false) Long customerId,
            @RequestParam(value = "accountNo" , required = false) String accountNo,
            @RequestParam(value = "gsmNumber" , required = false) String gsmNumber,
            @RequestParam(value = "firstName" , required = false) String firstName,
            @RequestParam(value = "lastName" , required = false) String lastName,
            @RequestParam(value = "customerOrderId" , required = false) Long customerOrderId){
        FindCustomerRequest findCustomerRequest = new FindCustomerRequest(natId,customerId,accountNo,gsmNumber,firstName,lastName,customerOrderId);
        return customerService.getCustomersByFilter(findCustomerRequest);
    }
}
