package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.IContactMediumService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cam/contactMediums")
@AllArgsConstructor
public class ContactMediumController {
    private IContactMediumService contactMediumService;
}
