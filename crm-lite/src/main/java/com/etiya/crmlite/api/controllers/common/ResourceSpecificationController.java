package com.etiya.crmlite.api.controllers.common;

import com.etiya.crmlite.business.abstracts.common.IResourceSpecificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common/resourceSpecifications")
@AllArgsConstructor
public class ResourceSpecificationController {
    private IResourceSpecificationService resourceSpecificationService;
}
