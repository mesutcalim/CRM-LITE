package com.etiya.crmlite.entities.concretes.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ETIYA_TYPE_VALUE")
@Builder
public class EtiyaTypeValue {
    @Id
    @SequenceGenerator(name = "typeValueSeq", sequenceName = "TYPE_VALUE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "typeValueSeq")
    @Column(name = "TYPE_VALUE_ID")
    private Long typeValueId;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "FIELD_NAME", unique = true)
    private int fieldName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "USING_MODULE_NAME")
    private String usingModuleName;

}
