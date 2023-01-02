package com.etiya.crmlite.business.dtos.requests.cam.customers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCustomerRequest {

    private Long customerId;
    @NotNull
    private Long statusId;
    @NotNull
    private Long partyRoleId;

    private Long customerTypeId;
}
