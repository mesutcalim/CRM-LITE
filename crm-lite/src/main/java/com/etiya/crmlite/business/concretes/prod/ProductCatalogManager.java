package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductCatalogService;
import com.etiya.crmlite.repositories.prod.IProductCatalogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductCatalogManager implements IProductCatalogService {
    IProductCatalogRepository productCatalogRepository;
}
