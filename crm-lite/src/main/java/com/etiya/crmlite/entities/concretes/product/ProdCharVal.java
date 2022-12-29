package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import com.etiya.crmlite.entities.concretes.common.GnlChar;
import com.etiya.crmlite.entities.concretes.common.GnlCharVal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROD_CHAR_VAL")
@Builder
public class ProdCharVal extends BaseEntity {
    @Id
    @Column(name = "PROD_CHAR_VAL_ID")
    @SequenceGenerator(name = "prodCharValSeq", sequenceName = "PROD_CHAR_VAL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodCharValSeq")
    private Long prodCharValId;

    @Column(name = "VAL")
    private String val;

    @Column(name = "ST_ID")
    private Long stId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROD_ID")//,updatable = false,insertable = false)
    private Prod prod;

    @ManyToOne
    @JoinColumn(name = "CHAR_ID")//,updatable = false,insertable = false)
    private GnlChar gnlChar;  // GNL_CHAR tablosu ile FK ?

    @ManyToOne
    @JoinColumn(name = "CHAR_VAL_ID")//,updatable = false,insertable = false)
    private GnlCharVal gnlCharVal; // GNL_CHAR_VAL tablosu ile FK ?



}
