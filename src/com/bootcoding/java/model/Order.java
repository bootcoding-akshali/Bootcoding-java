package com.bootcoding.java.model;


import java.util.List;

public class Order {
    private long customerId;
    private long vendorId;
    double totalprice;
    private String deliveryAddress;
    OrderStatus status;
    List<MenuItem>menuItems;

}
