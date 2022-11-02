package Excercise;

import java.util.Scanner;

public class Factorial2 {
    public static void printFactorial(int n) {
        int factorial=1;
        for(int i=n; i>=1;i--) {
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        printFactorial(n);

    }

}

