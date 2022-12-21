package com.etiya.crmlite.repositories.camRepositories;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.cam.CustAcctProdInvl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustAcctProdInvlRepository extends JpaRepository<CustAcctProdInvl,Long> {
}
