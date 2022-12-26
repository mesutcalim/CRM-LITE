package com.etiya.crmlite.api.controllers.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductSpecificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/productSpecifications")
@AllArgsConstructor
public class ProductSpecificationController {
    private IProductSpecificationService productSpecificationService;
}
