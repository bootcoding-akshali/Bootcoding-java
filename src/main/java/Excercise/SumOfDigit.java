package Excercise;

public class SumOfDigit {
    public static void main(String[] args) {
        int sumOfDigits = findSumOfDigits(3, 6);
        System.out.println(sumOfDigits);
    }
    public static int findSumOfDigits(int no, int sum){
        if (no==0)
            return sum ;
          sum += no % 10;
          return findSumOfDigits(no/10 ,sum);
    }
}
