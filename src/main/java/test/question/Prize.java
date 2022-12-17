package test.question;
//Create a function that takes three arguments prob, prize, pay and returns true  if prob * prize > pay; otherwise return false.
public class Prize {
    public static void main(String[] args) {
        boolean prize = getPrize(0.2, 50, 9);
        System.out.println(prize);
    }
    public static boolean getPrize(double prize, double prob , double pay){
        if ((prob * prize) > pay){
            return true;
        }
         return false;
    }
}
