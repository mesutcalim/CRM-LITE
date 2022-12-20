package com.etiya.crmlite.entities.concretes;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable {

    @CreatedDate
    @Column(name = "cdate", updatable = false)
    private Date cdate;

    @CreatedBy
    @Column(name = "cuser", updatable = false)
    private Long cuser;


    @LastModifiedDate
    @Column(name = "udate", insertable = false)
    private Date udate;

    @LastModifiedBy
    @Column(name = "uuser", insertable = false)
    private Long uuser;



}
