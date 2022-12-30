package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.IAddressService;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CreateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.UpdateAddressRequest;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllAddressResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetByIdAddressResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cam/addresses")
@AllArgsConstructor
public class AddressController {

    private IAddressService addressService;

    @GetMapping("/getbyid")
    public DataResult<GetByIdAddressResponse> getById(@RequestParam Long id) {
        return this.addressService.getById(id);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllAddressResponse>> getAll () {
        return this.addressService.getAll();
    }


    @PostMapping("/add")
    public Result add(@RequestBody @Valid CreateAddressRequest createAddressRequest) {
        return this.addressService.addAddress(createAddressRequest);
    }
    @PostMapping("/update")
    public Result update(@RequestParam("addressId") Long addressId,@RequestBody @Valid UpdateAddressRequest updateAddressRequest) {
        return this.addressService.updateAddress(addressId,updateAddressRequest);
    }
    @PostMapping("/delete")
    public Result delete(@RequestParam Long addressId) {
        return this.addressService.deleteAddress(addressId);
    }

}
