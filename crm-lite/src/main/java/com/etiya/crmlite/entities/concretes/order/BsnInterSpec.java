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
@Table(name="BSN_INTER_SPEC")
@Builder
public class BsnInterSpec extends BaseEntity {
    @Id
    @Column(name="BSN_INTER_SPEC_ID")
    @SequenceGenerator(name = "bsnInterSpecSeq", sequenceName = "BSN_INTER_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bsnInterSpecSeq")
    private Long bsnInterSpecId;

    @Column(name = "PRNT_BSN_INTER_SPEC_ID")
    private Long prntBsnInterSpecId;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCR")
    private String descr;

    @Column(name="SHRT_CODE")
    private String shrtCode;

    @Column(name="IS_ACTV")
    private int isActv;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_TP_ID")
    private BsnInterTp bsnInterTp;

    @OneToMany(mappedBy = "bsnInterSpec")
    private List<BsnInter>bsnInters;


}
