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
@Table(name = "CUST_ACCT")
@Builder
public class CustAcct extends BaseEntity {
    @Id
    @Column(name ="CUST_ACCT_ID")
    @SequenceGenerator(name = "custAcctSeq", sequenceName = "CUST_ACCT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custAcctSeq")
    private Long custAcctId;

    @Column(name="ACCT_NO")
    private String acctNo;

    @Column(name="ACCT_NAME")
    private String accountName;

    @Column(name = "DESCR")
    private String description;

    @Column(name="ST_ID")
    private Long stId;

    @Column(name = "ACCT_TP_ID")
    private Long acctTpId ; // accountType'a ait bir tablo yok.

    @ManyToOne
    @JoinColumn(name = "CUST_ID")
    private Cust cust;

    @OneToMany(mappedBy = "custAcct",cascade = CascadeType.ALL)
    private List<CustAcctProdInvl> custAcctProdInvls;

}
