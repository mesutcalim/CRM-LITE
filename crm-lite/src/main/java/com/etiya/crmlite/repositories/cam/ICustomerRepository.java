package com.etiya.crmlite.repositories.cam;


import com.etiya.crmlite.entities.concretes.cam.Cust;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Cust, Long> {

    @Query("SELECT DISTINCT new package com.etiya.crmlite.business.dtos.requests.cam.customers.FindCustomerResponse  " +
            "() FROM Party p JOİN p.ind i  ")
    List<Cust> getCustomersByFilter();
}
