package com.etiya.crmlite.business.abstracts.order;

import com.etiya.crmlite.business.dtos.responses.order.customerOrders.GetByIdCustomerOrderResponse;
import com.etiya.crmlite.core.util.results.DataResult;

public interface ICustomerOrderService {
    DataResult<GetByIdCustomerOrderResponse> getById(Long id);
}
