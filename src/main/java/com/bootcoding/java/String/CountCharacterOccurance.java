package com.bootcoding.java.String;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        String str = "java programming language";
       int totalCount = str.length();
       int totalCount_afterRemove = str.replace("a","").length();
       int count = totalCount - totalCount_afterRemove;
        System.out.println("Total Character is = "+count);

    }

}
