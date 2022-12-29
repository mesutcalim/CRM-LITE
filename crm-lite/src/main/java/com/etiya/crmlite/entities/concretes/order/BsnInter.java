package com.etiya.crmlite.entities.concretes.order;

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
@Table(name = "BSN_INTER")
@Builder
public class BsnInter extends BaseEntity {
    @Id
    @SequenceGenerator(name = "bsnInterSeq", sequenceName = "BSN_INTER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bsnInterSeq")
    @Column(name = "BSN_INTER_ID")
    private Long bsnInterId;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "PRNT_BSN_INTER_ID")
    private Long prntBsnInterId;

    @Column(name = "ROW_ID")
    private Long rowId;

    @Column(name = "DATA_TP_ID")
    private Long dataTpId;


    @Column(name = "CUST_ID")
    private Long custId;

    @ManyToOne    //hata aldık!!OneToOne
    @JoinColumn(name = "BSN_INTER_SPEC_ID")
    private BsnInterSpec bsnInterSpec;

    @OneToMany(mappedBy = "bsnInter")
    private List<BsnInterItem> bsnInterItems;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_ST_ID")
    private BsnInterSt bsnInterSt;

    /*
    @OneToMany(mappedBy = "businessInteraction")
    private List<CustomerOrderItem> customerOrderItems;

    @OneToOne
    @JoinColumn(name = "BSN_INTER_ST_ID")
    private BsnInterSt bsnInterSt;  //biz boyle düşündük üzerinden bir geç

    */

}
