package com.example.shopcar.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import javax.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_line", schema = "car_db", catalog = "")
public class ProductLine {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_line_id")
    private int productLineId;
    @Basic
    @Column(name = "product_line_descript")
    private String productLineDescript;
    @Basic
    @Column(name = "product_line_image")
    private String productLineImage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductLine that = (ProductLine) o;
        return productLineId == that.productLineId && Objects.equals(productLineDescript, that.productLineDescript) && Objects.equals(productLineImage, that.productLineImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productLineId, productLineDescript, productLineImage);
    }
}
