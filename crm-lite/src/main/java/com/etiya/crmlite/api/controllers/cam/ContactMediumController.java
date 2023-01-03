package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.IContactMediumService;
import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.CreateContactMediumRequest;
import com.etiya.crmlite.business.dtos.requests.cam.contactMediums.UpdateContactMediumRequest;
import com.etiya.crmlite.business.dtos.responses.cam.contactMediums.GetAllContactMediumResponse;
import com.etiya.crmlite.business.dtos.responses.cam.contactMediums.GetByIdContactMediumResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cam/contactMediums")
@AllArgsConstructor
public class ContactMediumController {
    private IContactMediumService contactMediumService;

    @PostMapping("/add")
    public Result add(@RequestBody @Valid CreateContactMediumRequest createContactMediumRequest) {
        return this.contactMediumService.add(createContactMediumRequest);
    }
    @PostMapping("/delete")
    public Result update(@RequestParam Long contactMediumId) {
        return this.contactMediumService.delete(contactMediumId);
    }
    @PostMapping("/update")
    public Result update(@RequestBody @Valid UpdateContactMediumRequest updateContactMediumRequest) {
        return this.contactMediumService.update(updateContactMediumRequest);
    }

    @GetMapping("/getbyid")
    public DataResult<GetByIdContactMediumResponse> getById(@RequestParam Long id) {
        return this.contactMediumService.getById(id);
    }
    @GetMapping("/getall")
    public DataResult<List<GetAllContactMediumResponse>> getAll() {
        return this.contactMediumService.getAll();
    }
}
