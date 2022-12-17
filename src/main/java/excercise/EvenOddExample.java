package excercise;

public class EvenOddExample {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(n);
        if (n % 2 ==0){
        n = n/2;
        }
        else {
            n = 3 * n + 1;
            System.out.println(n);
        }
    }
}
