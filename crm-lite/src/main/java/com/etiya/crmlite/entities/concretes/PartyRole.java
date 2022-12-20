package com.etiya.crmlite.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PartyRole extends AbstractBaseEntity{
    @Id
    @SequenceGenerator(name = "partyRoleSeq", sequenceName = "PARTY_ROLE_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partyRoleSeq")
    @Column(name = "PARTY_ROLE_ID")
    private Long partyRoleId;

    @Column(name = "PARTY_ID")
    private Long partyId;

    @Column(name = "PARTY_ROLE_TP_ID")
    private Long partyRoleTpId;

    @Column(name = "ST_ID")
    private Long stId;
}
