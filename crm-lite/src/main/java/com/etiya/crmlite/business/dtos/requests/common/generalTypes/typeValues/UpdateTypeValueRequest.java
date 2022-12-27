package com.etiya.crmlite.business.dtos.requests.common.generalTypes.typeValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateTypeValueRequest {
    private Long typeValueId;

    private String tableName;

    private int fieldName;

    private String description;

    private String value;

    private String usingModuleName;
}
