package com.bootcoding.java.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndHashset {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("pritam");
        names.add("Kajal");
        names.add("pavan");
        names.add("kajal");

        names.remove(0);
        System.out.println(names.size());
        System.out.println(names.contains("pavan"));
        System.out.println(names.isEmpty());
        for (String name: names){
            System.out.println(name);
        }

        List<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(2);
        numberList.add(4);

        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
