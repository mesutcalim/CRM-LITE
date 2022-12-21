package com.etiya.crmlite.repositories.camRepositories;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.cam.CustAcct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustAcctRepository extends JpaRepository<CustAcct,Long> {
}
