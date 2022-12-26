package com.etiya.crmlite.business.concretes.requests.cam.customerAccountProductInvolvements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCustomerAccountProductInvolvementRequest {

    private String shortCode;

    private Long statusId;

    private Long customerAccountId;

    private Long productId;
}
