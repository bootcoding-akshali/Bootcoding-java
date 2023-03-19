package com.bootcoding.java.String;

import java.util.Locale;

public class CheckVowel {
    public static void main(String[] args) {
        int vowelCount = 0;
        int cCount = 0;
        String str = "Today we will learn simple java";
        str = str.toLowerCase();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='u' || str.charAt(i)== 'o'){
                vowelCount++;
            } else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                cCount++;
                
            }
        }
        System.out.println("Count of vowel " +cCount);
        System.out.println("Count of Consonants " +vowelCount);
    }
}
