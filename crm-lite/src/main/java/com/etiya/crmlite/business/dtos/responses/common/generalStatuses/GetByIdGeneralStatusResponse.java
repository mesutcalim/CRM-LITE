package com.etiya.crmlite.business.dtos.responses.common.generalStatuses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdGeneralStatusResponse {

    private Long generalStatusId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

    private String entityCodeName;

    private String entityName;


}
