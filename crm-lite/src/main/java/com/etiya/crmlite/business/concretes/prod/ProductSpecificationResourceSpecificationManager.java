package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductSpecificationResourceSpecificationService;
import com.etiya.crmlite.repositories.prod.IProductSpecificationResourceSpecificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductSpecificationResourceSpecificationManager implements IProductSpecificationResourceSpecificationService
{
    IProductSpecificationResourceSpecificationRepository productSpecificationResourceSpecificationRepository;
}
