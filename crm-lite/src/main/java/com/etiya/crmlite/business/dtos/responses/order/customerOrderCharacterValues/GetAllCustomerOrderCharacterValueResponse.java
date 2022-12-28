package com.etiya.crmlite.business.dtos.responses.order.customerOrderCharacterValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCustomerOrderCharacterValueResponse {

    private Long customerOrderCharacterValueId;

    private Long characterId;

    private Long characterValueId;

    private String value;

    private int isActive;

    private Long customerOrderId;

}

