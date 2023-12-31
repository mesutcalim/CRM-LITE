package com.etiya.crmlite.api.controllers.order;

import com.etiya.crmlite.business.abstracts.order.ICustomerOrderCharacteristicValueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order/customerOrderCharacteristicValues")
@AllArgsConstructor
public class CustomerOrderCharacteristicValueController {

    private ICustomerOrderCharacteristicValueService customerOrderCharacteristicValueService;

}
