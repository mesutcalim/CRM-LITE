package com.etiya.crmlite.business.dtos.requests.common.generalTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateGeneralTypeRequest {
    private Long generalTypeId;

    private String name;

    private String description;

    private String shortCode;

    private String entCodeName;

    private String entName;

    private int isActive;
}
