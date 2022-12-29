package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROD_CATAL_PROD_OFR")
@Builder
public class ProdCatalProdOfr extends BaseEntity {
    @Id
    @Column(name = "PROD_CATAL_PROD_OFR_ID")
    @SequenceGenerator(name = "prodCatalProdOfrSeq", sequenceName = "PROD_CATAL_PROD_OFR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodCatalProdOfrSeq")
    private Long prodCatalProdOfrId;
    @Column(name="ST_ID")
    private Long stId;
    @ManyToOne
    @JoinColumn(name = "PROD_CATAL_ID")
    private ProdCatal prodCatal;// fk productCatal Tablosu
    @ManyToOne
    @JoinColumn(name = "PROD_OFR_ID")
    private ProdOfr prodOfr; // fk productOffer Tablosu
}
