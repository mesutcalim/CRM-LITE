package com.etiya.crmlite.repositories.prod;

import com.etiya.crmlite.entities.concretes.product.Cmpg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICampaignRepository extends JpaRepository<Cmpg, Long> {
}
