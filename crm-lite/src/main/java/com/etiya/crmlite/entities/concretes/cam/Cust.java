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
@Table(name = "CUST")
@Builder
public class Cust extends BaseEntity {
    @Id
    @Column(name="CUST_ID")
    @SequenceGenerator(name = "custSeq", sequenceName = "CUST_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custSeq")
    private Long custId;

    @Column(name = "ST_ID")
    private Long stId;

    @OneToOne
    @JoinColumn(name = "PARTY_ROLE_ID")
    private PartyRole partyRole;

    @ManyToOne
    @JoinColumn(name="CUST_TP_ID")
    private CustTp custTp;

    @OneToMany(mappedBy = "cust")
    private List<CustAcct> custAccts;






}
