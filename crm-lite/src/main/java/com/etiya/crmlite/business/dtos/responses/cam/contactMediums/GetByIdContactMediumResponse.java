package com.etiya.crmlite.business.dtos.responses.cam.contactMediums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByIdContactMediumResponse {
    private Long contactMediumId;

    private Long rowId;

    private Long dataTypeId;

    private String contactData;

    private Long statusId;

    private Long contactMediumTypeId;
}
