package com.bootcoding.java.service;

import com.bootcoding.java.model.Customer;

import java.util.Date;

public class CustomerService {

    public void registerCustomer() {

        Customer customer = new Customer();
        customer.setCity("Nagpur");
        customer.setName("pratik");
        customer.setDeliveryAddress("it park");
        customer.setState("maharashtra");
        customer.setId(2);
        customer.setCreatedAt(new Date());
        customer.print();
        System.out.println("Customer has been registered successfully");

    }
}