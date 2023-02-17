package com.bootcoding.java.Assignments;

public class Month {
    public static void main(String[] args) {
        int num = 8;
       printMonth(num);
    }
    public static void printMonth(int num){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.println(months[num-1]);

}

}
