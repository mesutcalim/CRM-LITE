package com.etiya.crmlite.repositories.cam;


import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Cust, Long> {

    @Query("SELECT DISTINCT NEW com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse " +
            "(c.custId,i.frstName,i.mName,i.lstName,prt.name,i.natId) " +
            "FROM Party p JOIN p.ind i " +
            "join p.partyRoles pr " +
            "join pr.cust c " +
            "join pr.partyRoleTp prt " +
            "join c.custAccts ca " +
            "join CustOrd co on co.custId = c.custId " +
            "join CntcMedium cm on (cm.rowId = p.partyId and cm.dataTpId = 9 and cm.cntcMediumTpId = 172) " +
            "where(i.natId = :natId or :natId is null) " +
            "and (c.custId = :customerId or :customerId is null) " +
            "and (ca.acctNo = :accountNumber or :accountNumber is null) " +
            "and (cm.cntcData = :gsmNumber or :gsmNumber is null) " +
            "and (lower(i.frstName) IN (lower(:firstName)) or :firstName is null) " +
            "and (lower(i.lstName) IN (lower(:lastName)) or :lastName is null) " +
            "and (co.custOrdId = :customerOrderId or :customerOrderId is null) ")
    List<FindCustomerResponse> getCustomersByFilter(Long customerId,
                                                    String firstName,
                                                    String lastName,
                                                    Long natId,
                                                    String gsmNumber,
                                                    Long customerOrderId,
                                                    String accountNumber
    );
}
