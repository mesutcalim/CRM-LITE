package com.etiya.crmlite.api.controllers.common;

import com.etiya.crmlite.business.abstracts.common.IServiceSpecificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common/serviceSpecifications")
@AllArgsConstructor
public class ServiceSpecificationController {
    private IServiceSpecificationService serviceSpecificationService;
}
