package com.etiya.crmlite.business.dtos.responses.cam.customers;

import com.etiya.crmlite.entities.concretes.cam.Party;
import com.etiya.crmlite.entities.concretes.cam.PartyRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCustomerResponse {
    private Long custId;
    private String frstName;
    private String mName;
    private String lstName;
    private PartyRole partyRole;
    private Long natId;
}
