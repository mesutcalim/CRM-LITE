package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import com.etiya.crmlite.entities.concretes.cam.CustAcctProdInvl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROD")
@Builder
public class Prod extends BaseEntity {
    @Id
    @Column(name = "PROD_ID")
    @SequenceGenerator(name = "prodSeq", sequenceName = "PROD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodSeq")
    private Long prodId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "TRNSC_ID")
    private Long trnscId;

    @Column(name="ST_ID")
    private int stId;

    @Column(name = "CMPG_ID")
    private Long cmpgId;

    @ManyToOne
    @JoinColumn(name = "PROD_OFR_ID")
    private ProdOfr prodOfr;

    @ManyToOne
    @JoinColumn(name = "PROD_SPEC_ID")
    private ProdSpec prodSpec;

    @OneToMany(mappedBy = "prod")
    private List<CustAcctProdInvl> custAcctProdInvls;

    @OneToMany(mappedBy = "prod",cascade = CascadeType.ALL)
    private List<ProdCharVal> prodCharVal;

    @OneToMany(mappedBy = "prod")
    private List<Prod> prods;

    @ManyToOne
    @JoinColumn(name = "PRNT_PROD_ID", referencedColumnName = "PROD_ID")
    private Prod prod;

    @OneToMany(mappedBy = "prod1")
    private List<ProdRel> prodRels1;

    @OneToMany(mappedBy = "prod2")
    private List<ProdRel> prodRels2;



}
