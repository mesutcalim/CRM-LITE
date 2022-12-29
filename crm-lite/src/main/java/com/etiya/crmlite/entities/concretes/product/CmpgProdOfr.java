package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CMPG_PROD_OFR")
@Builder
public class CmpgProdOfr extends BaseEntity {

    @Id
    @Column(name = "CMPG_PROD_OFR_ID")
    @SequenceGenerator(name = "cmpgProdOfrSeq", sequenceName = "CMPG_PROD_OFR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cmpgProdOfrSeq")
    private Long cmpgProdOfrId;
    @Column(name = "PRIO")
    private Long prio;
    @Column(name = "SDATE")
    private LocalDateTime sDate;
    @Column(name = "EDATE")
    private LocalDateTime eDate;
    @Column(name = "IS_ACTV")
    private int isActv;

    @Column(name = "PROD_OFR_NAME")
    private String prodOfrName;

    @ManyToOne
    @JoinColumn(name = "CMPG_ID")
    private Cmpg cmpg;

    @ManyToOne
    @JoinColumn(name = "PROD_OFR_ID")
    private ProdOfr prodOfr;

}
