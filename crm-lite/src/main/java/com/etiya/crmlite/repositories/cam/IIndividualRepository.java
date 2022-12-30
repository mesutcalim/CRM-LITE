package com.etiya.crmlite.repositories.cam;

import com.etiya.crmlite.entities.concretes.cam.Ind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIndividualRepository extends JpaRepository<Ind,Long> {
    Ind findByNatId(Long nationalityId);

    boolean existsCustByNatId(Long natId);
}
