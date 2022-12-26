package com.etiya.crmlite.api.controllers.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order/businessInteractionTypes")
@AllArgsConstructor
public class BusinessInteractionTypeController {

    private IBusinessInteractionTypeService businessInteractionTypeService;

}
