package com.etiya.crmlite.business.dtos.requests.cam.partyRoleTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePartyRoleTypeRequest {
    private Long partyRoleTpId;

    private String name;

    private String description;

    private String shortCode;

    private int isActive;

}
