package com.bootcoding.java.app;

import com.bootcoding.java.dao.DAOService;
import com.bootcoding.java.dao.OrderDAO;
import com.bootcoding.java.model.Customer;
import com.bootcoding.java.model.Order;
import com.bootcoding.java.model.Vendor;
import com.bootcoding.java.service.CustomerService;
import com.bootcoding.java.service.OrderService;
import com.bootcoding.java.service.VendorService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DAOService dbService = new DAOService();

        OrderDAO orderDAO = new OrderDAO();
        Customer customer = new Customer();
        Vendor vendor = new Vendor();

        List<Order> allOrders = orderDAO.getAllOrders();


        dbService.printCustomerData();
        System.out.println("********************************************************");
        dbService.printVendorData();
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

        CustomerService customerService = new CustomerService();
        customerService.registerCustomer();

        VendorService vendorService = new VendorService();
        vendorService.registerVendor();

    }


}
