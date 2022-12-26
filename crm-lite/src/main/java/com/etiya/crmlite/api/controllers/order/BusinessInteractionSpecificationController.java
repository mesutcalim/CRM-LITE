package com.etiya.crmlite.api.controllers.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionSpecificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order/businessInteractionSpecifications")
@AllArgsConstructor
public class BusinessInteractionSpecificationController {

    private IBusinessInteractionSpecificationService businessInteractionSpecificationService;

}
