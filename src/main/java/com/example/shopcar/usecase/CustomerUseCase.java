package com.example.shopcar.usecase;

import com.example.shopcar.model.Customers;

import java.util.List;

public interface CustomerUseCase {
    CustomerUseCase applyRequest(Customers customers);
    CustomerUseCase saveCustomer();
    String response();
    CustomerUseCase getAllCustomer();
    List<Customers> responseLstCustomer();
}
