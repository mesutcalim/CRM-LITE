package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
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
@Table(name = "PROD_OFR")
@Builder
public class ProdOfr extends BaseEntity {
    @Id
    @Column(name = "PROD_OFR_ID")
    @SequenceGenerator(name = "prodOfrSeq", sequenceName = "PROD_OFR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodOfrSeq")
    private Long prodOfrId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "PRNT_OFR_ID")
    private Long prntOfrId;

    @Column(name = "PROD_OFR_TOTAL_PRC")
    private Long prodOfrTotalPrc;
    @Column(name = "ST_ID")
    private Long stId;
    @ManyToOne
    @JoinColumn(name="PROD_SPEC_ID")
    private ProdSpec prodSpec;

    @OneToMany(mappedBy = "prodOfr")
    private List<Prod> products;

    @OneToMany(mappedBy = "prodOfr")
    private List<CmpgProdOfr> cmpgnProdOfrs;

    @OneToMany(mappedBy = "prodOfr")
    private List<ProdCatalProdOfr> prodCatalProdOfrs;

}
