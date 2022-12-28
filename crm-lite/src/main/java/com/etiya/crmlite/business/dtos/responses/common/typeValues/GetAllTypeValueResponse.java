package com.etiya.crmlite.business.dtos.responses.common.typeValues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllTypeValueResponse {

    private Long typeValueId;

    private String tableName;

    private int fieldName;

    private String description;

    private String value;

    private String usingModuleName;

}
