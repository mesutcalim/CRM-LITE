package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductOfferingService;
import com.etiya.crmlite.repositories.prod.IProductOfferingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductOfferingManager implements IProductOfferingService {
    IProductOfferingRepository productOfferingRepository;
}
