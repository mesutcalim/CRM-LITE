package com.etiya.crmlite.repositories.prod;

import com.etiya.crmlite.entities.concretes.product.ProdSpecRsrcSpec;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductSpecificationResourceSpecificationRepository extends JpaRepository<ProdSpecRsrcSpec,Long> {
}
