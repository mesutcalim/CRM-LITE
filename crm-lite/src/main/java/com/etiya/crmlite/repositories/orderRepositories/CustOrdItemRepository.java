package com.etiya.crmlite.repositories.orderRepositories;

import com.etiya.crmlite.entities.concretes.order.CustOrdItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustOrdItemRepository extends JpaRepository<CustOrdItem,Long> {
}
