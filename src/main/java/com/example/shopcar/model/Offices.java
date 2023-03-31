package com.example.shopcar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offices {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "office_id")
    private int officeId;
    @Basic
    @Column(name = "office_city")
    private String officeCity;
    @Basic
    @Column(name = "office_phone")
    private String officePhone;
    @Basic
    @Column(name = "address1")
    private String address1;
    @Basic
    @Column(name = "address2")
    private String address2;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "country")
    private String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offices offices = (Offices) o;
        return officeId == offices.officeId && Objects.equals(officeCity, offices.officeCity) && Objects.equals(officePhone, offices.officePhone) && Objects.equals(address1, offices.address1) && Objects.equals(address2, offices.address2) && Objects.equals(state, offices.state) && Objects.equals(country, offices.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, officeCity, officePhone, address1, address2, state, country);
    }
}
