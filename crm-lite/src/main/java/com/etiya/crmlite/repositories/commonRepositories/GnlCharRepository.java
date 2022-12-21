package com.etiya.crmlite.repositories.commonRepositories;

import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.entities.concretes.common.GnlChar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GnlCharRepository extends JpaRepository<GnlChar,Long> {
}
