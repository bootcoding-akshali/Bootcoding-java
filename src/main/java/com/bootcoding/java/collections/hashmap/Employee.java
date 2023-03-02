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
        System.out.println(emp.containsKey("Johan"));
        System.out.println(emp.containsValue(3));

        emp.put("Om",23);
        System.out.println(emp);

        emp.replace("Tom",777);
        System.out.println(emp);

    }
}
