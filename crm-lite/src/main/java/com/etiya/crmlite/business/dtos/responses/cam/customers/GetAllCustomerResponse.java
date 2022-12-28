package com.etiya.crmlite.business.dtos.responses.cam.customers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCustomerResponse {

    private Long customerId;

    private Long statusId;

    private Long partyRoleId;

}
