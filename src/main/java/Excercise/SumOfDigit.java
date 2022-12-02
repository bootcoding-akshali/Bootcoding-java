package Excercise;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 567;
        System.out.print("Sum of digits : "+ addDigit(n));
    }
    private static int addDigit(int no)
    {
        if (no == 0)
        {
            return 0;
        }
        return (no % 10 + addDigit(no / 10));
    }

}
