package com.example.shopcar.usecase.impl;

import com.example.shopcar.model.Customers;
import com.example.shopcar.repository.CustomerRep;
import com.example.shopcar.usecase.CustomerUseCase;

import java.util.ArrayList;
import java.util.List;

public class CustomerUserCaseImpl implements CustomerUseCase {

    private Customers customers =new Customers();
    private CustomerRep customerRep;

    private List<Customers> customersList = new ArrayList<>();

    public CustomerUserCaseImpl(CustomerRep customerRep) {
        this.customerRep = customerRep;
    }

    @Override
    public CustomerUseCase applyRequest(Customers customers) {
        this.customers = customers;
        return this;
    }

    @Override
    public CustomerUseCase saveCustomer() {
        Customers customersNew = new Customers();
        customersNew.setCustomerId(this.customers.getCustomerId());
        customersNew.setCustomerLastname(this.customers.getCustomerLastname());
        customersNew.setCustomerFirstname(this.customers.getCustomerFirstname());
        customersNew.setCustomerPhone(this.customers.getCustomerPhone());
        customersNew.setCustomerAddress1(this.customers.getCustomerAddress1());
        customersNew.setCustomerAddress2(this.customers.getCustomerAddress2());
        customersNew.setCity(this.customers.getCity());
        customersNew.setState(this.customers.getState());
        customersNew.setCountry(this.customers.getCountry());
        customersNew.setCreditLimit(this.customers.getCreditLimit());
        customersNew.setEmployeeId(this.customers.getEmployeeId());
        customerRep.save(customersNew);
        return this;
    }

    @Override
    public String response() {
        return "success";
    }

    @Override
    public CustomerUseCase getAllCustomer() {
        this.customersList = customerRep.getAllCustomer();
        return this;
    }


    @Override
    public List<Customers> responseLstCustomer() {
        return this.customersList;
    }
}
