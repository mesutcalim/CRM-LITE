package com.etiya.crmlite.business.dtos.requests.cam.customers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindCustomerRequest {
    @Size(min = 11,max = 11,message = "Sıfırdan Büük Olmalıdır")

    private Long natId;
    private Long customerId;
    private String accountNo;
    private String gsmNumber;
    private String firstName;
    private String lastName;
    private Long customerOrderId;




}
