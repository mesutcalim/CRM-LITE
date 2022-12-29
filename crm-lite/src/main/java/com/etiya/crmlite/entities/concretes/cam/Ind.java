package com.etiya.crmlite.entities.concretes.cam;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IND")
@Builder
public class Ind extends BaseEntity {
    @Id
    @Column(name = "IND_ID")
    @SequenceGenerator(name = "ındSeq", sequenceName = "IND_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ındSeq")
    private Long indId;

    @Column(name = "FRST_NAME")
    private String frstName;

    @Column(name = "MNAME")
    private String mName;

    @Column(name = "LST_NAME")
    private String lstName;

    @Column(name = "BRTH_DATE")
    private LocalDate brthDate;

    @Column(name = "GENDR_ID")
    private int genderId;

    @Column(name = "MTHR_NAME")
    private String mthrName;

    @Column(name="FTHR_NAME")
    private String fthrName;

    @Column(name = "NAT_ID")
    private Long natId;

    @Column(name="ST_ID")
    private Long stId;

    @OneToOne
    @JoinColumn(name = "PARTY_ID")
    private Party party;
}
