package com.etiya.crmlite.repositories.camRepositories;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.cam.PartyRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRoleRepository extends JpaRepository<PartyRole,Long> {
}
