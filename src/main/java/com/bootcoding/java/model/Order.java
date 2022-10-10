package com.bootcoding.java.model;


import java.util.List;

public class Order {
    private long customerId;

    private long vendorId;
    double totalprice;
    private String deliveryAddress;
    OrderStatus status;
    List<MenuItem>menuItems;


    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    public void print(){
        System.out.println(getCustomerId());
        System.out.println(getStatus());
        System.out.println(getDeliveryAddress());
        System.out.println(getTotalprice());
        System.out.println(getVendorId());
    }
}
