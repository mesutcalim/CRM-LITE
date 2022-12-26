package com.etiya.crmlite.business.concretes.requests.cam.contactMediums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteContactMediumRequest {
    @NotNull
    private Long contactMediumId;

}
