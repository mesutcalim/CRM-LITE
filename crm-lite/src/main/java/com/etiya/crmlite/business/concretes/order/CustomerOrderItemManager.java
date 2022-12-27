package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.ICustomerOrderItemService;
import com.etiya.crmlite.repositories.order.ICustomerOrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerOrderItemManager implements ICustomerOrderItemService {
    private ICustomerOrderItemRepository customerOrderItemRepository;
}
