package com.etiya.crmlite.business.dtos.requests.basket;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductConfigurationRequest {
    private Long customerOrderId;

    private List<AddProductOfferFromConfigRequest> addProductOfferFromConfigRequestList;

    private Long streetId;

    private Long buildingId;

    private String addressDescription;

    private int isActive;

    private String cityName;

    private String streetName;

    private String buildingName;

    private String countryName;
}
