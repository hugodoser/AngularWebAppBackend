package com.hugo.courselab.entity;

import javax.persistence.*;

@Entity
@Table(name = "region", schema = "public")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regionid")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Region() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}