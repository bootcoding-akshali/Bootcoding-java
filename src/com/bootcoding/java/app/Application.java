package com.bootcoding.java.app;

import com.bootcoding.java.model.Customer;
import com.bootcoding.java.service.OrderService;

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



        OrderService orderservice = new OrderService();
        orderservice.createOrder();
    }


}
