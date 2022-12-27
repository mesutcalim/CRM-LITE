package com.etiya.crmlite.business.dtos.requests.common.generalCharacterValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteGeneralCharacterValueRequest {
    private Long charterValueId;
}
