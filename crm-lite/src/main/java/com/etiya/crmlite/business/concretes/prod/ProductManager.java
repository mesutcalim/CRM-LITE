package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductService;
import com.etiya.crmlite.repositories.prod.IProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductManager implements IProductService {
    IProductRepository productRepository;
}
