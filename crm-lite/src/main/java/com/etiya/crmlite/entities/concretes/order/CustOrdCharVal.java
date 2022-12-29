package com.etiya.crmlite.entities.concretes.order;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CUST_ORD_CHAR_VAL")
@Builder
public class CustOrdCharVal extends BaseEntity {
    @Id
    @Column(name="CUST_ORD_CHAR_VAL_ID")
    @SequenceGenerator(name = "custOrdCharValSeq", sequenceName = "CUST_ORD_CHAR_VALSEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custOrdCharValSeq")
    private Long custOrdCharValId;

    @Column(name="CHAR_ID")
    private Long charId; // GNL_CHAR tablosunda FK alabilir mi ??

    @Column(name="CHAR_VAL_ID")
    private Long charValId; //GNL_CHAR_VAL tablosunda FK alabilir mi ??
    @Column(name="VAL")
    private String val;

    @Column(name="IS_ACTV")
    private int isActv;

    @ManyToOne
    @JoinColumn(name = "CUST_ORD_ID")
    private CustOrd custOrd;

}
