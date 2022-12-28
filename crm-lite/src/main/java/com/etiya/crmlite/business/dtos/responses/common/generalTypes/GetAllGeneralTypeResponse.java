package com.etiya.crmlite.business.dtos.responses.common.generalTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllGeneralTypeResponse {
    private Long generalTtypeId;

    private String name;

    private String description;

    private String shortCode;

    private String entCodeName;

    private String entName;

    private int isActive;

}

