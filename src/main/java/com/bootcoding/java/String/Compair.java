package com.bootcoding.java.String;

public class Compair {
    public static void main(String[] args) {
        String name1 = "tony";
        String name2 = "tony22";

        //s1 > s2 : +ve value
        //s1 == s2 : 0
        //s1 < s2 : -ve value

        if (name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}
