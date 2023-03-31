package com.example.shopcar.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_details", schema = "car_db", catalog = "")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_details_id", nullable = false)
    private Long order_details_id;
    @Basic
    @Column(name = "order_id")
    private Integer orderId;
    @Basic
    @Column(name = "product_id")
    private Integer productId;
    @Basic
    @Column(name = "quantity_ordered")
    private Integer quantityOrdered;
    @Basic
    @Column(name = "price_each")
    private Integer priceEach;
    @Basic
    @Column(name = "order_line_number")
    private Integer orderLineNumber;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(productId, that.productId) && Objects.equals(quantityOrdered, that.quantityOrdered) && Objects.equals(priceEach, that.priceEach) && Objects.equals(orderLineNumber, that.orderLineNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId, quantityOrdered, priceEach, orderLineNumber);
    }
}
