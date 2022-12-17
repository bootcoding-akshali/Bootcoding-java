package bootcoding.basicmatths;

public class Bank {
    public static void main(String[] args) {
        calculateInterest(100, 5,10);
    }
    public  static void calculateInterest (int amount, int years, double interestRate ){

        double interestRateMultiplier = 1 + interestRate / 100;
        double totalAmount = amount;

        for (int i=0; i<5;i++){

            totalAmount  = totalAmount  * interestRateMultiplier;
        }
        System.out.println(totalAmount);


        
    }
}
