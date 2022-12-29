package com.etiya.crmlite.repositories.cam;


import com.etiya.crmlite.business.dtos.responses.cam.customers.FindCustomerResponse;
import com.etiya.crmlite.business.dtos.responses.product.products.GetAllProductResponse;
import com.etiya.crmlite.entities.concretes.cam.Cust;
import com.etiya.crmlite.entities.concretes.prod.Prod;
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
            "join CntcMedium cm on cm.rowId = p.partyId " +
            "where" +
            "(cm.dataTpId is null or cm.dataTpId = 9) " +
            "and (cm.cntcMediumTpId is null or cm.cntcMediumTpId = 172) " +
            "and (i.natId = :natId or :natId is null) " +
            "and (c.custId = :customerId or :customerId is null) " +
            "and (ca.acctNo = :accountNumber or :accountNumber is null) " +
            "and (cm.cntcData = :gsmNumber or :gsmNumber is null) " +
            "and (:firstName is null or lower(i.frstName) = lower(:firstName) ) " +
            "and (:lastName is null or lower(i.lstName) = lower(:lastName)) " +
            "and (co.custOrdId = :customerOrderId or :customerOrderId is null) ")
    List<FindCustomerResponse> getCustomersByFilter(Long customerId,
                                                    String firstName,
                                                    String lastName,
                                                    Long natId,
                                                    String gsmNumber,
                                                    Long customerOrderId,
                                                    String accountNumber
    );


    @Query(value = "SELECT * FROM "+
            " FROM CUST_ACCT ca " +
            "JOIN CUST  c ON ca.CUST_ID = c.CUST_ID " +
            "JOIN CUST_ACCT_PROD_INVL capi ON capi.CUST_ACCT_ID = ca.CUST_ACCT_ID " +
            "JOIN PROD p ON capi.PROD_ID = p.PROD_ID WHERE p.ST_ID IN (1500,116,10600) AND c.CUST_ID = 615 ", nativeQuery = true)
    List<GetAllProductResponse> checkActiveProduct(Long customerId);
}
