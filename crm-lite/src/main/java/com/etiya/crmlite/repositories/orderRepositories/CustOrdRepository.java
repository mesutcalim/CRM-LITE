package com.etiya.crmlite.repositories.orderRepositories;

import com.etiya.crmlite.entities.concretes.order.CustOrd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustOrdRepository extends JpaRepository<CustOrd,Long> {
}
