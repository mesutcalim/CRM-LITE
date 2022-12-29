package com.etiya.crmlite.entities.concretes.order;

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
@Table(name = "BSN_INTER_ITEM")
@Builder
public class BsnInterItem extends BaseEntity {
    @Id
    @Column(name = "BSN_INTER_ITEM_ID")
    @SequenceGenerator(name = "bsnInterItemSeq", sequenceName = "BSN_INTER_ITEM_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bsnInterItemSeq")
    private Long bsnInterItemId;
    @Column(name = "DESCR")
    private String descr;
    @Column(name = "ROW_ID")
    private Long rowId;
    @Column(name = "DATA_TP_ID")
    private Long dataTpId;
    @Column(name = "ACTN_TP_ID")
    private Long actnTpId;
    @Column(name="ST_ID")
    private Long stId;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_ID")
    private BsnInter bsnInter;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_SPEC_ID")
    private BsnInterSpec bsnInterSpec;
}
