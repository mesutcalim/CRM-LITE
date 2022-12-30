package com.etiya.crmlite.business.abstracts.prod;

import com.etiya.crmlite.business.dtos.responses.product.products.GetByIdProductResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.entities.concretes.product.Prod;

public interface IProductService {
    DataResult<GetByIdProductResponse> getById(Long id);

    Prod getByProductId(Long id);

}
