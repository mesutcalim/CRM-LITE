package com.etiya.crmlite.business.dtos.requests.cam.contactMediums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateContactMediumRequest {

    @NotNull
    private Long rowId;
    @NotNull
    private Long dataTypeId;
    @NotNull
    private String contactData;

    private Long statusId;

    private Long contactMediumTypeId;
}
