package com.hugo.courselab.entity;

import javax.persistence.*;

@Entity
@Table(name = "country", schema = "public")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "countryid")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="regionid")
    private Region regionId;

    public Country() {
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

    public Region getRegionId() {
        return regionId;
    }

    public void setRegionId(Region regionId) {
        this.regionId = regionId;
    }
}