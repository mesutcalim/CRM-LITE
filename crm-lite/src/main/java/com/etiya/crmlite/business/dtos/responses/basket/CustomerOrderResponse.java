package com.etiya.crmlite.business.dtos.responses.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerOrderResponse {
    private Long customerOrderId;
    private List<CustomerOrderItemListResponse> customerOrderItemListResponse;
}

