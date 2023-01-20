package com.bootcoding.java.leetCodeprograms;
//palindrameNo 121,535,1221
public class PalindromeNumber {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);

    }
    public static boolean isPalindrome(int x) {

        int temp = x;
        int revers = 0;
        int sum;
        while (x > 0){
            sum = x % 10;
            revers = revers * 10 + sum;
            x = (x / 10);
        }
        if(revers == temp){
            return true;
        }else{
            return false;
        }
    }
}
