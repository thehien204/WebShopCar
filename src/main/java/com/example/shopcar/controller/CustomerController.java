package com.example.shopcar.controller;

import com.example.shopcar.helper.ApiResponse;
import com.example.shopcar.model.Customers;
import com.example.shopcar.service.CustomerService;
import com.example.shopcar.usecase.CustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.lang.annotation.Target;
import java.util.Arrays;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/create-customer", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> CreateCustomer(@RequestBody Customers customers) {
        try {
            return new ResponseEntity<>(ApiResponse.build(200, true, "success", customerService.saveCustomer(customers)), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            return new ResponseEntity<>(ApiResponse.build(500, true, "Success", null), HttpStatus.OK);
        }
    }

    @GetMapping(value = "/list-customer", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> ListCustomer() {
        try {
            return new ResponseEntity<>(ApiResponse.build(200, true, "success", customerService.customersList()), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            return new ResponseEntity<>(ApiResponse.build(500, true, "Success", null), HttpStatus.OK);
        }
    }

    @GetMapping(value = "/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> customerById(@PathVariable("id") Integer idCustomer){
        try{
            return new ResponseEntity<>(ApiResponse.build(200, true,"success", customerService.getCustomerById(idCustomer)), HttpStatus.OK);
        }catch (Exception e){
            e.getStackTrace();
            return new ResponseEntity<>(ApiResponse.build(500, true, "Success", null), HttpStatus.OK);
        }
    }
    @PutMapping (value = "/customer-update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> customerById(@RequestBody Customers customers){
        try{
            return new ResponseEntity<>(ApiResponse.build(200, true,"success", customerService.updateCustomer(customers)), HttpStatus.OK);
        }catch (Exception e){
            e.getStackTrace();
            return new ResponseEntity<>(ApiResponse.build(500, true, "Success", null), HttpStatus.OK);
        }
    }

}
