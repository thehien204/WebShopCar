package com.example.shopcar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import javax.persistence.*;
import java.util.Objects;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private int orderId;
    @Basic
    @Column(name = "order_date")
    private int orderDate;
    @Basic
    @Column(name = "require_date")
    private int requireDate;
    @Basic
    @Column(name = "shipped_date")
    private int shippedDate;
    @Basic
    @Column(name = "status")
    private int status;
    @Basic
    @Column(name = "comment")
    private int comment;
    @Basic
    @Column(name = "customer_id")
    private int customerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && orderDate == order.orderDate && requireDate == order.requireDate && shippedDate == order.shippedDate && status == order.status && comment == order.comment && customerId == order.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderDate, requireDate, shippedDate, status, comment, customerId);
    }
}
