package com.etiya.crmlite.business.concretes.prod;

import com.etiya.crmlite.business.abstracts.prod.IProductOfferingService;
import com.etiya.crmlite.business.dtos.responses.product.productOffers.GetByIdProductOfferResponse;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.entities.concretes.product.ProdOfr;
import com.etiya.crmlite.repositories.prod.IProductOfferingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductOfferingManager implements IProductOfferingService {
    IProductOfferingRepository productOfferingRepository;

    @Override
    public DataResult<GetByIdProductOfferResponse> getById(Long id) {
        ProdOfr result=this.productOfferingRepository.findById(id).get();
        GetByIdProductOfferResponse response= GetByIdProductOfferResponse.builder()
                .productOfferId(result.getPrntOfrId())
                .name(result.getName())
                .description((result.getDescr()))
                .parentOfferId(result.getPrntOfrId())
                .productOfferTotalPrice(result.getProdOfrTotalPrc())
                .productSpecification(result.getProdSpec().getProdSpecId()).build();

        return  new SuccessDataResult<>(response);
    }
}
