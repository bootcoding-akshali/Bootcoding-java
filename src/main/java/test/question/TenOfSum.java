package test.question;
//Create a function that takes two arguments. Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10.
public class TenOfSum {
    public static void main(String[] args) {
        boolean returnValue = getReturnValue(10, 12);
        System.out.println(returnValue);
    }
    public static boolean getReturnValue(int a , int b){

        return ((a + b) == 10 || a == 10 || b == 10);
    }
}
