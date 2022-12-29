package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.concretes.common.GnlChar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PROD_SPEC_CHAR_USE")
@Builder
public class ProdSpecCharUse {
    @Id
    @SequenceGenerator(name = "prodSpecCharUseSeq", sequenceName = "PROD_SPEC_CHAR_USE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodSpecCharUseSeq")
    @Column(name = "PROD_SPEC_CHAR_USE_ID")
    private Long prodSpecCharUseId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "IS_ACTV")
    private int isActv;


    @ManyToOne
    @JoinColumn(name = "PROD_SPEC_ID")
    private ProdSpec prodSpec;

    @ManyToOne      //onetoone dı
    @JoinColumn(name="CHAR_ID")
    private GnlChar gnlChar;
}
