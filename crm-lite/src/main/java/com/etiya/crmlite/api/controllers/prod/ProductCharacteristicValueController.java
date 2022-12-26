package com.etiya.crmlite.api.controllers.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductCharacteristicValueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/productCharacteristicValues")
@AllArgsConstructor

public class ProductCharacteristicValueController {
    private IProductCharacteristicValueService productCharacteristicValueService;
}
