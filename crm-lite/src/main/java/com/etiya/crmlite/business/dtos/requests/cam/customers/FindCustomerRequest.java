package com.etiya.crmlite.business.dtos.requests.cam.customers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindCustomerRequest {
    private Long natId;
    private Long customerId;
    private String accountNo;
    private String gsmNumber;
    private String firstName;
    private String lastName;
    private Long customerOrderId;




}
