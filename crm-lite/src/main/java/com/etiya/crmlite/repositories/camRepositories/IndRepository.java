package com.etiya.crmlite.repositories.camRepositories;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.cam.Ind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndRepository extends JpaRepository<Ind,Long> {
}
