package com.etiya.crmlite.business.dtos.requests.cam.customerAccounts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCustomerAccountRequest {

    private Long customerAccountId;

    private String accountNo;

    private String accountName;

    private Long statusId;

    private Long accountTypeId ; // accountType'a ait bir tablo yok.

    private Long customerId;


}
