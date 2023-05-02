package com.bootcoding.java.program;

import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {3,6,14,6,3,2};
        System.out.println(findDuplicateArray(arr));
    }
    public static boolean findDuplicateArray(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for (int no: arr){
            if (!s.add(no)){
                System.out.println(no);
            }
        }
        return true;
    }
}
