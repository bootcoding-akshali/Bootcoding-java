package bootcoding.basic.matths;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciSeries();
    }
    public  static void  fibonacciSeries(){
       int n = 10;
        int a = 0;
        int b = 1;
        int add;
        System.out.println(n);
        for (int i =1; i<=n; i++){
            System.out.println(+a);
            add = a + b;
            a = b;
            b= add;

        }

    }
}
