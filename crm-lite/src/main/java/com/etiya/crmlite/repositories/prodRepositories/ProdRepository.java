package com.etiya.crmlite.repositories.prodRepositories;

import com.etiya.crmlite.entities.concretes.prod.Prod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepository extends JpaRepository<Prod,Long> {
}
