package com.etiya.crmlite.business.dtos.responses.common.generalCharacterValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllGeneralCharacterValueResponse {
    private  Long characterValueId;
    private Long characterId;
    private int isDefault;
    private String value;
    private String shortCode;
    private int isActive;
}

