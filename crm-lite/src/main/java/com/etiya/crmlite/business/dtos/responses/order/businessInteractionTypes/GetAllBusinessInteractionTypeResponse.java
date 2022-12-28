package com.etiya.crmlite.business.dtos.responses.order.businessInteractionTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllBusinessInteractionTypeResponse {
    private int businessInteractionTypeId;

    private Long parentBusinessInteractionTypeId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

}

