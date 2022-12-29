package com.etiya.crmlite.entities.concretes.order;

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
@Table(name = "CUST_ORD")
@Builder
public class CustOrd extends BaseEntity {
    @Id
    @Column(name = "CUST_ORD_ID")
    @SequenceGenerator(name = "custOrdSeq", sequenceName = "CUST_ORD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custOrdSeq")
    private Long custOrdId;

    @Column(name = "ORD_ST_ID")
    private Long ordStId; // aşağıda da statusId var bunların hepsi GNL_ST tablosuna mı bağlı ???????


    @Column(name = "CUST_ID") //fk olmadığı için
    private Long custId;

    @Column(name = "BSN_INTER_ID")
    private Long bsnInterId; // fk yok


    @Column(name = "BSN_INTER_SPEC_ID")
    private Long bsnInterSpecId;

    @OneToMany(mappedBy = "custOrd")
    private List<CustOrdCharVal> custOrdCharVals;

    @OneToMany(mappedBy = "custOrd",cascade =  CascadeType.ALL)
    private List<CustOrdItem> custOrdItems;


}
