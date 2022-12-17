package excercise;

public class SumOFNaturalNo {
    public static void main(String[] args) {
        int i = printSumOfNaturalNo(15);
        System.out.println(i);
    }
    public static int printSumOfNaturalNo(int n){

        if (n==1){
            return n;
        }

        return n + printSumOfNaturalNo(n-1);

    }

}
