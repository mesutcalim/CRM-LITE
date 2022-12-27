package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductRelationService;
import com.etiya.crmlite.repositories.prod.IProductRelationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductRelationManager implements IProductRelationService {
    IProductRelationRepository productRelationRepository;
}
