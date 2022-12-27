package com.etiya.crmlite.business.dtos.requests.cam.partyRoles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePartyRoleRequest {


    private Long statusId;

    private Long partyId;

    private Long partyRoleTypeId;
}