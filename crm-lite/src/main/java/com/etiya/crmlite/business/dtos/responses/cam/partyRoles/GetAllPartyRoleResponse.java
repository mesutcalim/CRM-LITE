package com.etiya.crmlite.business.dtos.responses.cam.partyRoles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllPartyRoleResponse {

    private Long partyRoleId;

    private Long statusId;
}
