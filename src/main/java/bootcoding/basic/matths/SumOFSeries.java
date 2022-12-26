package bootcoding.basic.matths;

public class SumOFSeries {
    public static void main(String[] args) {
      calculateSumOfSeries(10);
    }
    public static double calculateSumOfSeries(int n){
       double sum =0.0;
       for (double i =1; i<=n; i++){
           sum = sum + 1/i;

       }
        System.out.println(sum);
        return  sum;
    }
}
