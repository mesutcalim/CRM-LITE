package com.etiya.crmlite.api.controllers.prod;

import com.etiya.crmlite.business.abstracts.cam.IAddressService;
import com.etiya.crmlite.business.abstracts.prod.IProductCatalogProductOfferingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod/productCatalogProductOfferings")
@AllArgsConstructor
public class ProductCatalogProductOfferingController {

    private IProductCatalogProductOfferingService productCatalogProductOfferingService;
}
