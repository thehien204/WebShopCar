package com.example.shopcar.repository;

import com.example.shopcar.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface CustomerRep extends CrudRepository<Customers,Integer> {
    @Query(value = "SELECT * FROM CUSTOMERS", nativeQuery = true)
    List<Customers> getAllCustomer();
    @Query(value = "SELECT * FROM CUSTOMERS as customer where customer.customer_id = :customerId",nativeQuery = true)
    Customers findByCustomerId(@Param("customerId") Integer idCustomer);
}
