package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROD_REL")
@Builder
public class ProdRel extends BaseEntity {
    @Id
    @SequenceGenerator(name = "prodRelSeq", sequenceName = "PROD_REL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodRelSeq")
    @Column(name = "PROD_REL_ID")
    private Long prodRelId;

    @Column(name = "REL_TP_ID")
    private Long relTpId;

    @Column(name = "IS_ACTV")
    private int isActv;

    @ManyToOne
    @JoinColumn(name = "PROD_ID1")
    private Prod prod1;

    @ManyToOne
    @JoinColumn(name = "PROD_ID2")
    private Prod prod2;
}
