package com.etiya.crmlite.api.controllers.order;

import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionStatusService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order/businessInteractionStatues")
@AllArgsConstructor
public class BusinessInteractionStatusController {

    private IBusinessInteractionStatusService businessInteractionStatusService;


}
