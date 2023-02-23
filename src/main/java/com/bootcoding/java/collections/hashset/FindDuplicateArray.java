package com.bootcoding.java.collections.hashset;

import java.util.HashSet;

public class FindDuplicateArray {
    public static void main(String[] args) {
        int[] array = {3,4,5,3,5,7,4,2,8};
        HashSet<Integer> duplicateArray = new HashSet<>();
         for (int no : array){
             if (duplicateArray.add(no) == false){
                 System.out.println(no);
             }
         }
    }
}
