package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.IAddressService;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CreateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CustomerAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.UpdateAddressRequest;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllAddressResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllCustomerAddressesResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetByIdAddressResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cam/addresses")
@AllArgsConstructor
public class AddressController {

    private IAddressService addressService;

    @GetMapping("/getbyid")
    public ResponseEntity<DataResult<GetByIdAddressResponse>> getById(@RequestParam Long id) {
        return new ResponseEntity<>(addressService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<GetAllAddressResponse>>> getAll () {
        return new ResponseEntity<>(addressService.getAll(),HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Result> add(@RequestBody @Valid CreateAddressRequest createAddressRequest) {
        return  new ResponseEntity<>(addressService.addAddress(createAddressRequest),HttpStatus.CREATED);
    }
    @PostMapping("/update")
    public ResponseEntity<Result> update(@RequestParam("addressId") Long addressId,@RequestBody @Valid UpdateAddressRequest updateAddressRequest) {
        return new ResponseEntity<>(addressService.updateAddress(addressId,updateAddressRequest),HttpStatus.OK);
    }
    @PostMapping("/delete")
    public ResponseEntity<Result> delete(@RequestParam Long addressId) {
        return new ResponseEntity<>(addressService.deleteAddress(addressId),HttpStatus.OK);
    }

    @PostMapping("/getAllCustomerAddresses")
    public DataResult<List<GetAllCustomerAddressesResponse>>getAllCustomerAddresses(@RequestBody CustomerAddressRequest customerAddressRequest) {
        return this.addressService.getAllCustomerAddresses(customerAddressRequest);
    }
//    @PostMapping("/customerUpdateAddress")
//    public DataResult<Page<GetByCustomerUpdateAddressResponse>> customerUpdateAddress(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize,@RequestBody CustomerUpdateAddressRequest customerUpdateAddressRequest) {
//        Pageable pageable = PageRequest.of(page,pageSize);
//        return this.addressService.customerUpdateAddress(customerUpdateAddressRequest, pageable);
//    }

    @GetMapping("/getWithPaginationDto")
    // RequestParam => page,pageSize
    public Page<GetAllAddressResponse> getWithPaginationDto(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize){
        Pageable pageable = PageRequest.of(page,pageSize);
        return addressService.getAllWithPage(pageable);
    }
}
