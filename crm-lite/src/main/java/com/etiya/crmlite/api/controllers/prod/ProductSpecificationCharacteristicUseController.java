package com.etiya.crmlite.api.controllers.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductSpecificationCharacteristicUseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/productSpecificationCharacteristicUses")
@AllArgsConstructor
public class ProductSpecificationCharacteristicUseController {
    private IProductSpecificationCharacteristicUseService productSpecificationCharacteristicUseService;
}
