package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.ICustomerOrderService;
import com.etiya.crmlite.repositories.order.ICustomerOrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerOrderManager implements ICustomerOrderService {
    private ICustomerOrderRepository customerOrderRepository;
}
