package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import com.etiya.crmlite.entities.concretes.common.RsrcSpec;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROD_SPEC_RSRC_SPEC")
@Builder
public class ProdSpecRsrcSpec extends BaseEntity {
    @Id
    @Column(name = "PROD_SPEC_RSRC_SPEC_ID")
    @SequenceGenerator(name = "prodSpecRsrcSpecSeq", sequenceName = "PROD_SPEC_RSRC_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodSpecRsrcSpecSeq")
    private Long prodSpecRsrcSpecId;

    @Column(name="REL_TP_ID")
    private Long relTpId;
    @Column(name="SDATE")
    private LocalDateTime sDate;

    @Column(name="EDATE")
    private LocalDateTime eDate;

    @Column(name="ST_ID")
    private Long stId;

    @ManyToOne
    @JoinColumn(name="RSRC_SPEC_ID")
    private RsrcSpec rsrcSpec;

    @ManyToOne
    @JoinColumn(name="PROD_SPEC_ID")
    private ProdSpec prodSpec;// ??? PROD_SPEC_RSRC_SPEC ile nasıl bir bağlantısı var ?
}
