package com.etiya.crmlite.api.controllers.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductRelationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/productRelations")
@AllArgsConstructor
public class ProductRelationController {
    private IProductRelationService productRelationService;
}
