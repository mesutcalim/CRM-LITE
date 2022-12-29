package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import com.etiya.crmlite.entities.concretes.common.SrvcSpec;
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
@Table(name = "PROD_SPEC_SRVC_SPEC")
@Builder
public class ProdSpecSrvcSpec extends BaseEntity {
    @Id
    @Column(name = "PROD_SPEC_SRVC_SPEC_ID")
    @SequenceGenerator(name = "prodSpecSrvcSpecSeq", sequenceName = "PROD_SPEC_SRVC_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodSpecSrvcSpecSeq")
    private Long prodSpecSrvcSpecId;
    @Column(name = "REL_TP_ID")
    private Long relTpId;
    @Column(name = "SDATE")
    private LocalDateTime sDate;
    @Column(name = "EDATE")
    private LocalDateTime eDate;
    @Column(name = "ST_ID")
    private Long stId;
    @ManyToOne
    @JoinColumn(name = "SRVC_SPEC_ID")
    private SrvcSpec srvcSpec;

    @ManyToOne
    @JoinColumn(name = "PROD_SPEC_ID", insertable = false, updatable = false)
    private ProdSpec prodSpec; // ??? PROD_SPEC_SRVC_SPEC ile nasıl bir bağlantısı var ?


}
