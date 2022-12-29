package com.etiya.crmlite.repositories.prod;

import com.etiya.crmlite.entities.concretes.product.ProdCatal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductCatalogRepository extends JpaRepository<ProdCatal, Long> {
}
