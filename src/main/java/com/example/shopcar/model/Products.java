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
public class Products {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "product_code")
    private String productCode;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "product_line")
    private Integer productLine;
    @Basic
    @Column(name = "product_scale")
    private String productScale;
    @Basic
    @Column(name = "product_vendor")
    private String productVendor;
    @Basic
    @Column(name = "produc_description")
    private String producDescription;
    @Basic
    @Column(name = "quantity_stock")
    private Integer quantityStock;
    @Basic
    @Column(name = "price")
    private Double price;
    @Basic
    @Column(name = "msrp")
    private Double msrp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return productId == products.productId && Objects.equals(productCode, products.productCode) && Objects.equals(productName, products.productName) && Objects.equals(productLine, products.productLine) && Objects.equals(productScale, products.productScale) && Objects.equals(productVendor, products.productVendor) && Objects.equals(producDescription, products.producDescription) && Objects.equals(quantityStock, products.quantityStock) && Objects.equals(price, products.price) && Objects.equals(msrp, products.msrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productCode, productName, productLine, productScale, productVendor, producDescription, quantityStock, price, msrp);
    }
}
