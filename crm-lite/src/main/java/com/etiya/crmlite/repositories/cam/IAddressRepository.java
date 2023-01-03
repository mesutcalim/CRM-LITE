package com.etiya.crmlite.repositories.cam;

import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllAddressResponse;
import com.etiya.crmlite.entities.concretes.cam.Addr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IAddressRepository extends JpaRepository<Addr,Long> {

    
    @Query("Select new com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllAddressResponse(a.addrId,a.strtId,a.bldgId,a.addrDesc,a.cityName,a.strtName,a.cntryName) from Addr as a")
    Page<GetAllAddressResponse> getAllWithPage(Pageable pageable);

    boolean existsAddrsByAddrId(Long addressId);
}

