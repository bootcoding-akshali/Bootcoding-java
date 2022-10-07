package com.bootcoding.java.service;

import com.bootcoding.java.model.Order;
import com.bootcoding.java.model.OrderStatus;

public class OrderService {

    public boolean createOrder(){

        Order order = new Order();
        order.setCustomerId(1);
        order.setStatus(OrderStatus.NEW);
        order.setDeliveryAddress("Nagpur");
        order.setTotalprice(500.0);
        order.setVendorId(2);
        order.print();
        int a= 10;
        int b= 20;
        int c;

        System.out.println("Order has been placed!");
        double discountedPrice = applyDiscount(order.getTotalprice());

        System.out.println("Total price after applying discount :" + discountedPrice);

        return true;

    }
    public double applyDiscount(double price){

        double discount = price*0.1;

        return price-discount;
    }
}
