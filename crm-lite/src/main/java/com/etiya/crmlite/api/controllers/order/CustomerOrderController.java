package com.etiya.crmlite.api.controllers.order;

import com.etiya.crmlite.business.abstracts.order.ICustomerOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order/customerOrders")
@AllArgsConstructor
public class CustomerOrderController {
    private ICustomerOrderService customerOrderService;

}
