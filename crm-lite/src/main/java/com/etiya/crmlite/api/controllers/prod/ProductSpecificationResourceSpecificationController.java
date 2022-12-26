package com.etiya.crmlite.api.controllers.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductSpecificationResourceSpecificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/productSpecificationResourceSpecifications")
@AllArgsConstructor
public class ProductSpecificationResourceSpecificationController {
    private IProductSpecificationResourceSpecificationService productSpecificationResourceSpecificationService;
}
