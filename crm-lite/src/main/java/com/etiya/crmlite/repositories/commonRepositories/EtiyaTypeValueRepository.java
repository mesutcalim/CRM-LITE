package com.etiya.crmlite.repositories.commonRepositories;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.common.EtiyaTypeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtiyaTypeValueRepository extends JpaRepository<EtiyaTypeValue,Long> {
}
