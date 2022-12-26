package bootcoding.basic.matths.Assignments;

public class SumSeries {
    public static void main(String[] args) {
     printSumOfSeries(5);
    }
    public static void printSumOfSeries(int n){
        int sum = 0;
        for (int i=1; i<=n;i++){
            sum = sum * 10+1;
        }
        System.out.println(sum);
    }
}
