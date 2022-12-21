package com.etiya.crmlite.repositories.camRepositories;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustRepository extends JpaRepository<Cust,Long> {
}
