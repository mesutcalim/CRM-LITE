package com.etiya.crmlite.repositories.prod;

import com.etiya.crmlite.entities.concretes.product.ProdRel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRelationRepository extends JpaRepository<ProdRel, Long> {
}
