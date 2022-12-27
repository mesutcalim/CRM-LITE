package com.etiya.crmlite.business.dtos.requests.common.generalCharacterValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateGeneralCharacterValueRequest {
    private Long charterValueId;

    private Long characterId;

    private int isDefault;

    private String value;

    private String shortCode;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
    private int isActive;
}
