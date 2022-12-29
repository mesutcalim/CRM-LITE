package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductService;
import com.etiya.crmlite.business.dtos.responses.product.products.GetByIdProductResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.entities.concretes.product.Prod;
import com.etiya.crmlite.repositories.prod.IProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductManager implements IProductService {
    IProductRepository productRepository;

        @Override
    public DataResult<GetByIdProductResponse> getById(Long id) {
            Prod result=this.productRepository.findById(id).get();
            GetByIdProductResponse response=GetByIdProductResponse.builder()
                    .productId(result.getProdId())
                    .name(result.getName())
                    .description(result.getDescr())
                    .transactionId(result.getTrnscId())
                    .campaignId(result.getCmpgId())
                    .productOfferId(result.getProdOfr().getPrntOfrId())
                    .build();

                    return new SuccessDataResult<>(response);
        }
}
