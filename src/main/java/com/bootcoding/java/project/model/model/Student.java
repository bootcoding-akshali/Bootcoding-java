package com.bootcoding.java.project.model.model;

import java.util.Date;

public class Student {
    private int id;
    private int user_id;
    private String name;
    private String email_id;
    private int phoneNo;
    private long create_Date;
    private long modified_date;


    public long getCreate_Date(Date date) {
        return create_Date;
    }

    public void setCreate_Date(long create_Date) {
        this.create_Date = create_Date;
    }

    public long getModified_date(Date date) {
        return modified_date;
    }

    public void setModified_date(long modified_date) {
        this.modified_date = modified_date;
    }

    StudentAddress studentAddress;

    public StudentAddress getStudentAddress() {

        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress)
    {
        this.studentAddress = studentAddress;
    }

    public void print() {
        System.out.println(getEmail_id());
        System.out.println(getName());
        System.out.println(getPhoneNo());
        System.out.println(getId());
    }

    public int getId() {

        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getUser_id(Object o) {

        return user_id;
    }

    public void setUser_id(int user_id) {

        this.user_id = user_id;
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail_id() {

        return email_id;
    }

    public void setEmail_id(String email_id) {

        this.email_id = email_id;
    }

    public  int getPhoneNo() {

        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {

        this.phoneNo = phoneNo;
    }

    public void add(Student student) {
    }
}
