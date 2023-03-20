package com.bootcoding.java.project.model.dao;

import com.bootcoding.java.project.model.model.Student;

import java.sql.*;

public class DBConnection {
    public Connection getDatabaseConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "postgres");
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean existsRecorde(Connection connection, String tableName, long id){
      try {
          Statement statement = connection.createStatement();
          String sql = "Select * from" + tableName + "where id = " +id;
          ResultSet resultSet = statement.executeQuery(sql);
          if (resultSet.next()){
              return true;
          }
      } catch (SQLException e) {
          e.printStackTrace();
      }
      return false;
    }
}
