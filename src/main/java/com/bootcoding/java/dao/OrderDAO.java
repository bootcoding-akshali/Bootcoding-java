package com.bootcoding.java.dao;

import com.bootcoding.java.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    private  Connection connection;
    public OrderDAO(){
        DAOService daoService = new DAOService();
        connection= daoService.getDatabaseConnection();


    }
    public List <Order> getAllOrders()  {
        ArrayList<Order> orders = new ArrayList<>();

        try {
            // Collection - multiple values


            PreparedStatement preparedStatement = connection.prepareStatement("select * from \"order\"");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                double totalprice = resultSet.getDouble("totalprice");

                String deliveryAddress = resultSet.getString("deliveryaddress");

                Order order = new Order();
                order.setTotalprice(totalprice);
                order.setDeliveryAddress(deliveryAddress);

                orders.add(order);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return orders;

    }
}
