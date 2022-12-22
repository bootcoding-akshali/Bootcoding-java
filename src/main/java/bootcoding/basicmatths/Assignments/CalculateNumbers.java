package bootcoding.basicmatths.Assignments;

public class CalculateNumbers {
    public static void main(String[] args) {
        calculateSum(125, 24);
    }
    public static void calculateSum(int a, int b){
        int sum ;
        int multi;
        int div;
        int sub;
        sum = a + b;
        multi = a * b;
        sub = a - b;
        div = a /b;
        System.out.println(sum);
        System.out.println(multi);
        System.out.println(sub);
        System.out.println(div);
    }
}
