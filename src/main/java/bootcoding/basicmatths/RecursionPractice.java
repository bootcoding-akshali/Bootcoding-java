package bootcoding.basicmatths;

public class RecursionPractice {
    public static void main(String[] args) {
        countdown(5);
        nLines(2);
        countup(4);
        displayBinary(23);
        System.out.println(prod(2,4));

    }
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
            System.out.println(",,,");
        }
    }
    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }
    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }
}
