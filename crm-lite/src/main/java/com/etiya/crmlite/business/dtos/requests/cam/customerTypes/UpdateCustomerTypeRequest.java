package com.etiya.crmlite.business.dtos.requests.cam.customerTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCustomerTypeRequest {
    private Long customerTypeId;
    private String name;
    private String description;
    private Long partyTypeId;
    private String shortCode;
    private int isActive;

}
