package com.etiya.crmlite.entities.concretes.common;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import com.etiya.crmlite.entities.concretes.product.ProdCharVal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GNL_CHAR_VAL")
@Builder
public class GnlCharVal extends BaseEntity {
    @Id
    @SequenceGenerator(name = "gnlCharValSeq", sequenceName = "GNL_CHAR_VAL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gnlCharValSeq")
    @Column(name = "CHAR_VAL_ID")
    private Long charValId;

    @Column(name ="CHAR_ID")
    private Long charId;

    @Column(name = "IS_DFLT")
    private int isDflt;

    @Column(name = "VAL")
    private String val;

    @Column(name = "SHRT_CODE")
    private String shrtCode;

    @Column(name = "SDATE")
    private LocalDateTime sDate;

    @Column(name = "EDATE")
    private LocalDateTime eDate;

    @Column(name = "IS_ACTV")
    private int isActv;

   // private int contactMediumTypeId; silinmiş tablodan

    @OneToMany(mappedBy = "gnlCharVal")
    private List<ProdCharVal> prodCharVals;
}
