package com.bootcoding.java.collections;

public class Person {
    private int id;
    private String currentDate;
    private Income income;

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Person(int id, String currentDate, Income income) {
        this.currentDate = currentDate;
        this.id = id;
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(int currentDate) {
        this.currentDate = String.valueOf(currentDate);
    }
}
