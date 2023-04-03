package com.example.shopcar.usecase.impl;

import com.example.shopcar.model.Customers;
import com.example.shopcar.repository.CustomerRep;
import com.example.shopcar.usecase.CustomerUseCase;

import java.util.ArrayList;
import java.util.List;

public class CustomerUserCaseImpl implements CustomerUseCase {

    private Customers customer =new Customers();
    private CustomerRep customerRep;

    private List<Customers> customersList = new ArrayList<>();
    private Integer idCustomer;

    public CustomerUserCaseImpl(CustomerRep customerRep) {
        this.customerRep = customerRep;
    }

    @Override
    public CustomerUseCase applyRequest(Customers customers) {
        this.customer = customers;
        return this;
    }

    @Override
    public CustomerUseCase applyRequest(Integer idCustomer) {
        this.idCustomer = idCustomer;
        return this;
    }

    @Override
    public CustomerUseCase saveCustomer() {
        Customers customersNew = new Customers();
        customersNew.setCustomerId(this.customer.getCustomerId());
        customersNew.setCustomerLastname(this.customer.getCustomerLastname());
        customersNew.setCustomerFirstname(this.customer.getCustomerFirstname());
        customersNew.setCustomerPhone(this.customer.getCustomerPhone());
        customersNew.setCustomerAddress1(this.customer.getCustomerAddress1());
        customersNew.setCustomerAddress2(this.customer.getCustomerAddress2());
        customersNew.setCity(this.customer.getCity());
        customersNew.setState(this.customer.getState());
        customersNew.setCountry(this.customer.getCountry());
        customersNew.setCreditLimit(this.customer.getCreditLimit());
        customersNew.setEmployeeId(this.customer.getEmployeeId());
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

    @Override
    public CustomerUseCase getCustomerById() {
        this.customer = customerRep.findByCustomerId(this.idCustomer);
        return this;
    }

    @Override
    public Customers responseCustomer() {
        return this.customer;
    }

    @Override
    public CustomerUseCase updateCustomer() {
        Customers customersNew = customerRep.findByCustomerId(this.customer.getCustomerId());
        customersNew.setCustomerLastname(this.customer.getCustomerLastname());
        customersNew.setCustomerFirstname(this.customer.getCustomerFirstname());
        customersNew.setCustomerPhone(this.customer.getCustomerPhone());
        customersNew.setCustomerAddress1(this.customer.getCustomerAddress1());
        customersNew.setCustomerAddress2(this.customer.getCustomerAddress2());
        customersNew.setCity(this.customer.getCity());
        customersNew.setState(this.customer.getState());
        customersNew.setCountry(this.customer.getCountry());
        customersNew.setCreditLimit(this.customer.getCreditLimit());
        customersNew.setEmployeeId(this.customer.getEmployeeId());
        customerRep.save(customersNew);
        return this;
    }
}
