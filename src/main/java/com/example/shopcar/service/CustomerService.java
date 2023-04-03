package com.example.shopcar.service;

import com.example.shopcar.model.Customers;
import com.example.shopcar.repository.CustomerRep;
import com.example.shopcar.usecase.CustomerUseCase;
import com.example.shopcar.usecase.impl.CustomerUserCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRep customerRep;
    public String saveCustomer(Customers customers){
        CustomerUseCase useCase = new CustomerUserCaseImpl(customerRep);
        return useCase
                .applyRequest(customers)
                .saveCustomer().response();
    }
    public List<Customers> customersList(){
        CustomerUseCase useCase = new CustomerUserCaseImpl(customerRep);
        return useCase
                .getAllCustomer()
                .responseLstCustomer();
    }
    public Customers getCustomerById(Integer idCustomer){
        CustomerUseCase useCase = new CustomerUserCaseImpl(customerRep);
        return useCase
                .applyRequest(idCustomer)
                .getCustomerById()
                .responseCustomer();
    }
    public String updateCustomer(Customers customers){
        CustomerUseCase useCase = new CustomerUserCaseImpl(customerRep);
        return useCase
                .applyRequest(customers)
                .updateCustomer()
                .response();
    }
}
