package com.bootcoding.java.dao;

import com.bootcoding.java.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private Connection connection;

    public CustomerDAO(){
        DAOService daoService= new DAOService();
        connection= daoService.getDatabaseConnection();
    }

    public List <Customer> getAllCustomer(){
        ArrayList<Customer> customers = new ArrayList<>();

        try {

            // Collection Multiple Value

            PreparedStatement preparedStatement = connection.prepareStatement("select * from \"Customer\"");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String emailed = resultSet.getString("emailId: ");

                String state = resultSet.getString("State:");

                Customer customer = new Customer();

                customer.setEmailID(emailed);
                customer.setState(state);
                customers.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

       return customers;
    }
}
