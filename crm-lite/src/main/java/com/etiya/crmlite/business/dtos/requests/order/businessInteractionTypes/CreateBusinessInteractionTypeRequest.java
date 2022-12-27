package com.etiya.crmlite.business.dtos.requests.order.businessInteractionTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBusinessInteractionTypeRequest {

    private Long parentBusinessInteractionTypeId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

}