package com.etiya.crmlite.repositories.prod;

import com.etiya.crmlite.entities.concretes.product.ProdCatalProdOfr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductCatalogProductOfferingRepository extends JpaRepository<ProdCatalProdOfr, Long> {
}
