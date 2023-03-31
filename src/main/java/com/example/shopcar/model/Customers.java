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
public class Customers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic
    @Column(name = "customer_lastname")
    private String customerLastname;
    @Basic
    @Column(name = "customer_firstname")
    private String customerFirstname;
    @Basic
    @Column(name = "customer_phone")
    private String customerPhone;
    @Basic
    @Column(name = "customer_address1")
    private String customerAddress1;
    @Basic
    @Column(name = "customer_address2")
    private String customerAddress2;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "credit_limit")
    private Double creditLimit;
    @Basic
    @Column(name = "employee_id")
    private Integer employeeId;


    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerLastname, customerFirstname, customerPhone, customerAddress1, customerAddress2, city, state, country, creditLimit, employeeId);
    }
}
