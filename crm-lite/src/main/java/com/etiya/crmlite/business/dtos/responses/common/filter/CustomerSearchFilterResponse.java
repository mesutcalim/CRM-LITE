package com.etiya.crmlite.business.dtos.responses.common.filter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CustomerSearchFilterResponse {

    private Long nationalIdentity;
    private Long customerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String role;

    @Override
    public String toString() {
        return "CustomerSearchFilterResponse{" +
                "nationalIdentity=" + nationalIdentity +
                ", customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

