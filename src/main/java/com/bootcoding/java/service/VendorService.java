package com.bootcoding.java.service;

import com.bootcoding.java.model.Vendor;

public class VendorService {

    public void registerVendor(){
        Vendor vendor= new Vendor();
        vendor.setCity("Nagpur");
        vendor.setName("pavan");
        vendor.setId(2);
        vendor.setId(1);
        vendor.setState("Maharashtra");
        vendor.print();
        System.out.println("Vendor has been Registered successfully");
    }
}
