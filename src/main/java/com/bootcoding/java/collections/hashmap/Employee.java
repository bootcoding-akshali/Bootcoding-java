package com.bootcoding.java.collections.hashmap;

import java.util.HashMap;

public class Employee {
    public static void main(String[] args) {
        HashMap<String,Integer> emp = new HashMap<>();
        emp.put("pratik",1);
        emp.put("Ram",2);
        emp.put("Sham",3);
        System.out.println(emp);
        System.out.println(emp.get("pratik"));

    }
}
