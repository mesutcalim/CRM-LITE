package com.etiya.crmlite.business.dtos.requests.cam.customerAccounts;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class UpdateCustomerAccountRequest {

    private Long customerAccountId;

    private String accountNo;

    private String accountName;

    private Long statusId;

    private Long accountTypeId ; // accountType'a ait bir tablo yok.

    private Long customerId;
}
