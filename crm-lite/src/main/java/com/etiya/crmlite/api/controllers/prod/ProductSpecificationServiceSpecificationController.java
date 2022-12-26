package com.etiya.crmlite.api.controllers.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductSpecificationServiceSpecificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/productSpecificationServiceSpecifications")
@AllArgsConstructor
public class ProductSpecificationServiceSpecificationController {
    private IProductSpecificationServiceSpecificationService productSpecificationServiceSpecificationService;
}
