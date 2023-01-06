package excercise;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 7;
        printPrimeNo(n);
    }
    public static void printPrimeNo(int n){
        int count =0;
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime No");
        }
        else {
            System.out.println("Not prime no");
        }
    }
}
