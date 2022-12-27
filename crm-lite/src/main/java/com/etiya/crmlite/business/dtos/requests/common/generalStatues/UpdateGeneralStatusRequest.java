package com.etiya.crmlite.business.dtos.requests.common.generalStatues;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateGeneralStatusRequest {
    private Long generalStatusId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

    private String entCodeName;

    private String entName;

}
