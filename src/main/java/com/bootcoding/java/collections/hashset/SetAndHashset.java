package com.bootcoding.java.collections.hashset;

import java.util.HashSet;
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
    }
}
