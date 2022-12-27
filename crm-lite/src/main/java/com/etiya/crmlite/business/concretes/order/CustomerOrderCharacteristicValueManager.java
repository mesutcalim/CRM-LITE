package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.ICustomerOrderCharacteristicValueService;
import com.etiya.crmlite.repositories.order.ICustomerOrderCharacteristicValueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerOrderCharacteristicValueManager implements ICustomerOrderCharacteristicValueService {
    private ICustomerOrderCharacteristicValueRepository customerOrderCharacteristicValueRepository;
}
