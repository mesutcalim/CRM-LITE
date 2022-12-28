package com.etiya.crmlite.business.dtos.responses.basket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasketResponse {
    private Long customerOrderId;
}

