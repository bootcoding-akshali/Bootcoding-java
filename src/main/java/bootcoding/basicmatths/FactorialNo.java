package bootcoding.basicmatths;

public class FactorialNo {
    public static void main(String[] args) {
        int n = 12;
        for(int i = (n-4);i<=n;i++)
        {
        FindNumbersFactorial(i);
    }
    
}

    private static void FindNumbersFactorial(int no)
    {
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
