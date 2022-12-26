package com.etiya.crmlite.api.controllers.order;

import com.etiya.crmlite.business.abstracts.order.ICustomerOrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order/customerOrderItems")
@AllArgsConstructor
public class CustomerOrderItemController {
    private ICustomerOrderItemService customerOrderItemService;


}
