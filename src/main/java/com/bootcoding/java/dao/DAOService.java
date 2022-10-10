package com.bootcoding.java.dao;

import java.sql.*;

public class DAOService {
    public Connection getDatabaseConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    // Driver Load
    // DB Connection
    // Query Statement
    // Execute Query

    public void printCustomerData() {
        try {
            Connection databaseConnection = getDatabaseConnection();
            PreparedStatement preparedStatement = databaseConnection.prepareStatement("SELECT * from customer");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println("id = " + resultSet.getString("id"));
                System.out.println("Email Id = " + resultSet.getString("emailid"));
                System.out.println("Delivery Address = " + resultSet.getString("deliveryaddress"));
                System.out.println("Registered Data = " + resultSet.getString("createdat"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void printVendorData(){
        try {
            Connection dbConnection = getDatabaseConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement("Select * from vendor ");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println("id = " + resultSet.getString("id"));
                System.out.println("Latitude location = " + resultSet.getDouble("latitude"));
                System.out.println("Registered Date = " + resultSet.getString("registrationdate"));
                System.out.println("is restaurant approved = " + resultSet.getBoolean("approved"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
