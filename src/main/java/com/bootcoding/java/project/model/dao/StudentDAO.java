package com.bootcoding.java.project.model.dao;

import com.bootcoding.java.project.model.model.Student;

import java.sql.*;

public class StudentDAO {
    private static final String TABLE_NAME = "student";

    public void printStudentData() {
        try {
            DBConnection dbConnection = new DBConnection();
            Connection con = dbConnection.getDatabaseConnection();
            ;
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * from student");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("id =" + resultSet.getString("id"));
                System.out.println("name =" + resultSet.getString("name"));
                System.out.println("email_id =" + resultSet.getString("email_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStudentData(Student student) {
        DBConnection dbConnection = new DBConnection();
        Connection databaseConnection = dbConnection.getDatabaseConnection();
        try {
            PreparedStatement stmt = databaseConnection.prepareStatement("insert into Student values(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, student.getId());
            stmt.setTimestamp(2, new Timestamp(student.getCreate_Date(new java.util.Date())));
            stmt.setTimestamp(3, new Timestamp(student.getModified_date(new java.util.Date())));
            stmt.setString(4, null);
            stmt.setInt(5, student.getUser_id(null));
            stmt.setString(6, student.getName());
            stmt.setString(7, student.getEmail_id());
            stmt.setString(8, null);
            stmt.setInt(9, student.getPhoneNo());
            stmt.executeUpdate();
            databaseConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        DBConnection dbConnection = new DBConnection();
        try {
            Connection databaseConnection = dbConnection.getDatabaseConnection();
            Statement statement = databaseConnection.createStatement();
            String TABLE_NAME = "add_student";
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL, "
                    + " name text ,"
                    + " address text, "
                    + " phone_number bigint, "
                    + " user_id bigint NOT NULL, "
                    + " email_id text, "
                    + " CONSTRAINT app_add_student_pk PRIMARY KEY (id))";
            System.out.println("Student Table Query : " + query);
            statement.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    }
//    public void insertStudentData() {
//        DBConnection dbConnection = new DBConnection();
//        try {
//
//            Connection databaseConnection = dbConnection.getDatabaseConnection();
//            Statement statement = databaseConnection.createStatement();
//            String sql = "INSERT INTO student" +
//                    "(id, name,email_id ,phone_no)\n" +
//                    "VALUES(4, 'ankit', 'a@gmail.com', 9873544)";
//            statement.executeUpdate(sql);
//            System.out.println("record inserted..");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }



