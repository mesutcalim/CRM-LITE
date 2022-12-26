package com.etiya.crmlite.api.controllers.cam;

import com.etiya.crmlite.business.abstracts.cam.ICustomerAccountProductInvolvementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cam/customerAccountProductInvolvements")
@AllArgsConstructor
public class CustomerAccountProductInvolvementController {
    private ICustomerAccountProductInvolvementService customerAccountProductInvolvementService;
}
