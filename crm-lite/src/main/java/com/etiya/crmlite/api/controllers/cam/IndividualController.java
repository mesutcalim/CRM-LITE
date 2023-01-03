package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.IIndividualService;
import com.etiya.crmlite.business.dtos.requests.cam.individuals.CreateIndividualCustomerRequest;
import com.etiya.crmlite.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/cam/individuals")
@AllArgsConstructor
public class IndividualController {
   private IIndividualService individualService;

//   @PostMapping("/add")
//    public ResponseEntity<Result> addIndividual(@RequestBody CreateIndividualCustomerRequest createIndividualCustomerRequest){
//        return new ResponseEntity<>(individualService.addIndividualcreateIndividualCustomerRequest), HttpStatus.CREATED);
//    }

    @PostMapping("/add-individual-customer")
    public Result addIndividualCustomer(@RequestBody @Valid CreateIndividualCustomerRequest createIndividualCustomerRequest) throws Exception {
        return this.individualService.addIndividualCustomer(createIndividualCustomerRequest);
    }
}
