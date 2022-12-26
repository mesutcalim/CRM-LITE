package com.etiya.crmlite.api.controllers.order;


import com.etiya.crmlite.business.abstracts.order.IBusinessInteractionItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order/businessInteractionItems")
@AllArgsConstructor
public class BusinessInteractionItemController {
    private IBusinessInteractionItemService businessInteractionItemService;


}
