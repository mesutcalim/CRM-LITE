package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductSpecificationService;
import com.etiya.crmlite.repositories.prod.IProductSpecificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductSpecificationManager implements IProductSpecificationService {
    IProductSpecificationRepository productSpecificationRepository;
}
