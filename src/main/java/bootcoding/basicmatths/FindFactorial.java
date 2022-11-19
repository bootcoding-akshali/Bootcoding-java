package bootcoding.basicmatths;

public class FindFactorial {
    public static void main(String[] args) {
//        int n = 12;
//        for (int i = (n-4); i <= n; i++) {
        printFactorial(5);

    }

    public static void printFactorial(int no) {
        if (no<=0){
            System.out.println("0");
        }else {
            long fact = 1;
            for (int i = 1; i <= no; i++) {
                fact = fact * i;
        }
            System.out.println(fact);

        }

    }
}

