package com.etiya.crmlite.business.dtos.responses.common.generalChars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class GetAllGeneralCharacterResponse {
    private Long characterId;
    private String name;
    private String description;
    private String providerClass;
    private String shortCode;
    private  int isActive;

}
