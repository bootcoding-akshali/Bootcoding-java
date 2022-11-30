package Excercise;

public class SumOFNaturalNo {
    public static void main(String[] args) {
        int i = printSumOfNaturalNo(15);
        System.out.println(i);
    }
    public static int printSumOfNaturalNo(int n){
        if (n!=0)
            return n + printSumOfNaturalNo(n-1);
        else
        return n;
    }

}
