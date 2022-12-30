package com.etiya.crmlite.repositories.cam;

import com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetByIdCustomerAccountProductInvolvementResponse;
import com.etiya.crmlite.entities.concretes.cam.CustAcctProdInvl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICustomerAccountProductInvolvementRepository extends JpaRepository<CustAcctProdInvl,Long> {
    @Query(value = "select new com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetByIdCustomerAccountProductInvolvementResponse(capi.custAcctProdInvlId,capi.custAcct.custAcctId,capi.prod.prodId,capi.shrtCode,capi.stId) " +
            "FROM CustAcctProdInvl capi " +
            "JOIN CustAcct ca on ca.custAcctId = capi.custAcct.custAcctId " +
            "JOIN Cust c on c.custId = ca.cust.custId where c.custId=:customerId AND capi.stId=9010")
    List<GetByIdCustomerAccountProductInvolvementResponse> getActiveProductsOfCustomer(Long customerId);

    @Query(value = "Select new com.etiya.crmlite.business.dtos.responses.cam.customerAccountProductInvolvements.GetByIdCustomerAccountProductInvolvementResponse(capi.custAcctProdInvlId,capi.custAcct.custAcctId,capi.prod.prodId,capi.shrtCode,capi.stId)"+
            "FROM CustAcctProdInvl  capi " +
            "JOIN CustAcct ca ON ca.custAcctId = capi.custAcct.custAcctId WHERE ca.custAcctId = :customerAccountId AND capi.stId = 9010 AND ca.acctTpId= 224")
    List<GetByIdCustomerAccountProductInvolvementResponse> getActiveProductsOfBillingAccount(Long customerAccountId);


    List<CustAcctProdInvl> findByCustAcctCustAcctId(Long customerAccountId);
}
