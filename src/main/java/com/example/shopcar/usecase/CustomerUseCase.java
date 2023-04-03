package com.example.shopcar.usecase;

import com.example.shopcar.model.Customers;

import java.util.List;

public interface CustomerUseCase {
    CustomerUseCase applyRequest(Customers customers);
    CustomerUseCase applyRequest(Integer idCustomer);
    CustomerUseCase saveCustomer();
    String response();
    CustomerUseCase getAllCustomer();
    List<Customers> responseLstCustomer();
    CustomerUseCase getCustomerById();
    Customers responseCustomer();
    CustomerUseCase updateCustomer();

}
