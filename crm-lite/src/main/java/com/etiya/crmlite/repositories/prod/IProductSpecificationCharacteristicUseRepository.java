package com.etiya.crmlite.repositories.prod;

import com.etiya.crmlite.entities.concretes.product.ProdSpecCharUse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductSpecificationCharacteristicUseRepository extends JpaRepository<ProdSpecCharUse,Long> {
}
