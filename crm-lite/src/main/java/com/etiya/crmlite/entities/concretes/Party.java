package com.etiya.crmlite.entities.concretes;


import javax.persistence.*;

public class Party {

    @Id
    @SequenceGenerator(name = "partyRoleSeq", sequenceName = "PARTY_ROLE_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partyRoleSeq")
    @Column(name = "PARTY_ROLE_ID")
    private Long partyRoleId;

    @Column(name="PARTY_TP_ID")
    private Long partyTpId;

    @Column(name="ST_ID")
    private int stId;
}
