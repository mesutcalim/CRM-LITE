package com.etiya.crmlite.business.concretes.requests.cam.customerAccountProductInvolvements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCustomerAccountProductInvolvementRequest {

    private Long customerAccountProductInvolvementId;

    private String shortCode;

    private Long statusId;

    private Long customerAccountId;

    private Long productId;
}
