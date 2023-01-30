package com.bootcoding.java.dao;

import com.bootcoding.java.model.Customer;
import com.bootcoding.java.model.Order;
import com.bootcoding.java.model.Vendor;

import javax.lang.model.element.Name;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorDAO {

    private Connection connection;

    public VendorDAO(){
       DAOService daoService = new DAOService();
       connection=daoService.getDatabaseConnection();
    }

    public List <Vendor> getAllOrders() {
        ArrayList<Vendor> vendors = new ArrayList<>();


        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from \"vendor\"");
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()){
                String name = resultSet.getString("name");
                String state = resultSet.getString("State:");
                String city = resultSet.getString("city");

                Vendor vendor = new Vendor();

                vendor.setName(name);
               vendor.setState(state);
                vendor.setCity(city);
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vendors;
        }

    }


