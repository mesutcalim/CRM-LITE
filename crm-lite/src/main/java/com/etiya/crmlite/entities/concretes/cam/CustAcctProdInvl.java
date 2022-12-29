package com.etiya.crmlite.entities.concretes.cam;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import com.etiya.crmlite.entities.concretes.product.Prod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUST_ACCT_PROD_INVL")
@Builder
public class CustAcctProdInvl extends BaseEntity {
    @Id
    @Column(name = "CUST_ACCT_PROD_INVL_ID")
    @SequenceGenerator(name = "custAcctProdInvlSeq", sequenceName = "CUST_ACCT_PROD_INVL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custAcctProdInvlSeq")
    private Long custAcctProdInvlId;

    @Column(name = "SHRT_CODE")
    private String shrtCode;

    @Column(name = "ST_ID")
    private Long stId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUST_ACCT_ID")
    private CustAcct custAcct;

    @ManyToOne  //onetoone yapmışlar
    @JoinColumn(name="PROD_ID")
    private Prod prod;

}
