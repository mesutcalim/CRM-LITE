package com.etiya.crmlite.entities.abstracts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {
    @Column(name = "CDATE")
    private LocalDateTime cDate;
    @Column(name = "CUSER")
    private Long cUser;
    @Column(name = "UDATE")
    private LocalDateTime uDate;
    @Column(name = "UUSER")
    private Long uUser;
   // private int statusId;

    @PrePersist
    public void onCreate(){
        this.cDate=LocalDateTime.now();
        this.cUser=8L;
    }

    @PreUpdate
    public void onUpdate(){
        this.uUser=8L;
        this.cUser=8L;
        this.uDate=LocalDateTime.now();
    }

}
