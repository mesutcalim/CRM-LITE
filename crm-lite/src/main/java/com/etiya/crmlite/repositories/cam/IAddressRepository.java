package com.etiya.crmlite.repositories.cam;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Addr,Long> {
}
