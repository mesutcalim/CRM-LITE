package com.etiya.crmlite.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PARTY")
@Entity
public class Party extends AbstractBaseEntity{

    @Id
    @SequenceGenerator(name = "partySeq", sequenceName = "PARTY_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partySeq")
    @Column(name = "PARTY_ID")
    private Long partyId;

    @Column(name="PARTY_TP_ID")
    private Long partyTpId;

    @Column(name="ST_ID")
    private int stId;
}
