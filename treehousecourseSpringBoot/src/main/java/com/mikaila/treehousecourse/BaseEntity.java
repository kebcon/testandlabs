package com.mikaila.treehousecourse;

//No one can create a base entity..they must extend it
//tell JPA its a mapped superclass with annotation

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;

    protected BaseEntity() {
        this.id = null;
    }


}
