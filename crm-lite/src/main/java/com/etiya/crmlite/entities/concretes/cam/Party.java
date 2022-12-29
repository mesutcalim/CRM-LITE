package com.etiya.crmlite.entities.concretes.cam;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARTY")
@Builder
public class Party extends BaseEntity {
    @Id
    @Column(name = "PARTY_ID")
    @SequenceGenerator(name = "partySeq", sequenceName = "PARTY_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partySeq")
    private Long partyId;

    @Column(name="ST_ID")
    private Long stId;

    @Column(name="PARTY_TP_ID")
    private Long partyTpId;// FK

    @OneToMany(mappedBy = "party")  //onetoone yapmıştık
    private List<PartyRole> partyRoles;

    @OneToOne(mappedBy = "party")
    private Ind ind;
}
