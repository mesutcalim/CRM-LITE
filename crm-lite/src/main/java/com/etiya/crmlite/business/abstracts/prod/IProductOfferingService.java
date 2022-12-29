package com.etiya.crmlite.business.abstracts.prod;

import com.etiya.crmlite.business.dtos.responses.product.productOffers.GetByIdProductOfferResponse;
import com.etiya.crmlite.core.util.results.DataResult;

public interface IProductOfferingService {
    DataResult<GetByIdProductOfferResponse> getById(Long id);
}
