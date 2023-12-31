package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cam/customerTypes")
@AllArgsConstructor
public class CustomerTypeController {
   private ICustomerTypeService customerTypeService;
}
