package com.etiya.crmlite.business.dtos.requests.cam.customers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CreateCustomerRequest {
    //private Long customerId;

    private Long statusId;

    private Long partyRoleId;

    private Long customerTypeId;

}
