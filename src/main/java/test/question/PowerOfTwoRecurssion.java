package test.question;
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//        An integer n is a power of two, if there exists an integer x such that n == 2 power of x.
public class PowerOfTwoRecurssion {
    public static void main(String[] args) {
        boolean b = recursionOfTwo(32);
        System.out.println(b);
    }
    public static boolean recursionOfTwo(int n){
        if(n==0){
            return false;
        }
        if (n==1){
            return true;
        }

        return n%2 == 0 && recursionOfTwo(n/2);
    }
}
