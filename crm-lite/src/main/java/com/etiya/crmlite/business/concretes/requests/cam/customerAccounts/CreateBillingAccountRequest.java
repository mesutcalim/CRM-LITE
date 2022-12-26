package com.etiya.crmlite.business.concretes.requests.cam.customerAccounts;


import com.etiya.crmlite.business.concretes.requests.cam.individuals.CreateAddressForIndividualRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBillingAccountRequest {
    @NotNull
    private Long customerId;
    @NotNull
    private  String customerDescription;

    List<CreateAddressForIndividualRequest> createAddressForIndividualRequests;




}
