package com.hugo.courselab.entity;

import javax.persistence.*;

@Entity
@Table(name = "Location", schema = "public")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locationid")
    private Integer id;

    @Column(name = "streetaddress")
    private String streetAddress;

    @Column(name = "postalcode")
    private String postalCode;

    @Column(name = "city")
    private String city;

    @Column(name = "stateprovince")
    private String stateProvince;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="countryid")
    private Country countryId;

    public Location() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }
}