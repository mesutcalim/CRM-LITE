package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductCharacteristicValueService;
import com.etiya.crmlite.repositories.prod.IProductCharacteristicValueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductCharacteristicValueManager implements IProductCharacteristicValueService {
    IProductCharacteristicValueRepository productCharacteristicValueRepository;
}
