package Excercise;

public class NaturalNo {
    public static void main(String[] args) {
       int n =1;
       getNaturalNo(n);

    }
    public  static void getNaturalNo(int num){
        if (num <=50)
            System.out.println(num+" ");
        getNaturalNo(num+1);

    }
}
