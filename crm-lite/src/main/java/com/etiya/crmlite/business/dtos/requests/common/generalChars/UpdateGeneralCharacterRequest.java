package com.etiya.crmlite.business.dtos.requests.common.generalChars;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateGeneralCharacterRequest {

    private Long characterId;

    private String name;

    private String description;

    private String providerClass;

    private String shortCode;

    private int isActive;
}
