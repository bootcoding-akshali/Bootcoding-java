package com.bootcoding.java.String;

public class StringReverse2024 {
    public static void main(String[] args) {
        String str = "Akshali";
        String result = "";
         for (int i = str.length()-1; i>=0;i--){
             result+=str.charAt(i);
         }
        System.out.println(result);
    }
}
