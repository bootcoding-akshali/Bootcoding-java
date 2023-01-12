package bootcoding.basic.matths;

public class Armstrong {
    public static void main(String[] args) {
        printArmstrongNumbers(153);
    }
    public  static  void printArmstrongNumbers(int n){
        int num2 = 20;
        for(int i=1; i<=500;i++) {
            int d = i;
            int result = 0;
            while (d > 0) {
                int x = d % 10;
                result = result + (x * x * x);
                d = d / 10;
            }
            if (i == result) {
                System.out.println(result);
            }
        }
    }
}
