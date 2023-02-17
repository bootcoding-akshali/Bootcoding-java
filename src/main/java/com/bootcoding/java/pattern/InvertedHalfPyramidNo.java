package com.bootcoding.java.pattern;

public class InvertedHalfPyramidNo {
    public static void main(String[] args) {
        invertedHalfPyramidWithNo(5);
    }
    public static void invertedHalfPyramidWithNo(int n){
        //outer loop
        for (int i=1;i<=n;i++){
            //inner loop
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
