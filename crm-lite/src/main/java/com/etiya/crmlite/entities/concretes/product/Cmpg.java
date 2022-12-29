package com.etiya.crmlite.entities.concretes.product;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CMPG")
@Builder
public class Cmpg extends BaseEntity {
    @Id
    @Column(name = "CMPG_ID")
    @SequenceGenerator(name = "cmpgSeq", sequenceName = "CMPG_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cmpgSeq")
    private Long cmpgId;
    @Column(name = "name")
    private String name;
    @Column(name = "DESCR")
    private String descr;
    @Column(name = "CMPG_CODE")
    private String cmpgCode;
    @Column(name = "ACTVT_EDATE")
    private LocalDateTime actvtEDate;
    @Column(name="ST_ID")
    private Long stId;
    @Column(name = "IS_PENALTY")
    private int isPenalty;


    @OneToMany(mappedBy = "cmpg")
    private List<CmpgProdOfr> campgProdOfrs;
}
