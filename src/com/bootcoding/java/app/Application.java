package com.bootcoding.java.app;

import com.bootcoding.java.model.Customer;

public class Application {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setName("Akshali");
        c.setCity("Nagpur");
        c.setState("Maharashtra");
        c.setDeliveryAddress("Nagpur");
        c.print();

        Customer cus = new Customer();
        cus.setName("Akshali");
        cus.setCity("Nagpur");
        cus.setState("Maharashtra");
        cus.setDeliveryAddress("Nagpur");
        cus.print();

        Customer ct = new Customer();
        ct.setName("Akshali");
        ct.setCity("Nagpur");
        ct.setState("Maharashtra");
        ct.setDeliveryAddress("Nagpur");
        ct.print();

        Customer cust = new Customer();
        cust.setName("Akshali");
        cust.setCity("Nagpur");
        cust.setState("Maharashtra");
        cust.setDeliveryAddress("Nagpur");
        cust.print();
    }


}
