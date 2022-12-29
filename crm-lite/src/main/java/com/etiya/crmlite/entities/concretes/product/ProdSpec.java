package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROD_SPEC")
@Builder
public class ProdSpec extends BaseEntity {
    @Id
    @Column(name = "PROD_SPEC_ID")
    @SequenceGenerator(name = "prodSpecSeq", sequenceName = "PROD_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodSpecSeq")
    private Long prodSpecId;
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "ST_ID")
    private Long stId;
    @Column(name = "IS_DEV")
    private int isDev; // boolean olabilir.

    @OneToMany(mappedBy = "prodSpec")
    private List<ProdOfr> productOfrs;

    @OneToMany(mappedBy = "prodSpec")
    private List<Prod> prods;

    @OneToMany(mappedBy = "prodSpec")
    private List<ProdSpecRsrcSpec> prodSpecRsrcSpecs;

    @OneToMany(mappedBy = "prodSpec")
    private List<ProdSpecSrvcSpec> prodSpecSrvcSpecs;

    @OneToMany(mappedBy = "prodSpec")
    private List<ProdSpecCharUse> prodSpecCharUses;
}
