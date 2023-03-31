package com.example.shopcar.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id", nullable = false)
    private Integer paymentId;

    @Basic
    @Column(name = "customer_id")
    private int customerId;
    @Basic
    @Column(name = "payment_check")
    private String paymentCheck;
    @Basic
    @Column(name = "payment_date")
    private Date paymentDate;
    @Basic
    @Column(name = "amount")
    private int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payments payments = (Payments) o;
        return customerId == payments.customerId && amount == payments.amount && Objects.equals(paymentCheck, payments.paymentCheck) && Objects.equals(paymentDate, payments.paymentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, paymentCheck, paymentDate, amount);
    }
}
