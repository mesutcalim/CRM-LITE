package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductCatalogProductOfferingService;
import com.etiya.crmlite.repositories.prod.IProductCatalogProductOfferingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductCatalogProductOfferingManager implements IProductCatalogProductOfferingService {
    IProductCatalogProductOfferingRepository productCatalogProductOfferingRepository;
}
