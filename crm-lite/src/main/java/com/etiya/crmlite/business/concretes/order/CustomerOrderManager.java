package com.etiya.crmlite.business.concretes.order;

import com.etiya.crmlite.business.abstracts.order.ICustomerOrderService;
import com.etiya.crmlite.business.dtos.responses.order.customerOrders.GetByIdCustomerOrderResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.entities.concretes.order.CustOrd;
import com.etiya.crmlite.repositories.order.ICustomerOrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerOrderManager implements ICustomerOrderService {
    private ICustomerOrderRepository customerOrderRepository;

    @Override
    public DataResult<GetByIdCustomerOrderResponse> getById(Long id) {
        CustOrd result =this.customerOrderRepository.findById(id).get();
        GetByIdCustomerOrderResponse response = GetByIdCustomerOrderResponse.builder().
                customerId(result.getCustId()).
                customerOrderId(result.getCustOrdId())
                .orderStatusId(result.getOrdStId())
                .build();
        return new SuccessDataResult<>(response);
    }
}

