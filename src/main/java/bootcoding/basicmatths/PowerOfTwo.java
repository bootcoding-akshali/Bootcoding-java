package bootcoding.basicmatths;

public class PowerOfTwo {
    public static void main(String[] args) {
        boolean b = powerOfttwo(32);
        System.out.println(b);
    }
    public static boolean powerOfttwo(int n){
        if (n==1)
            return false;
        if (n % 2 == 0){
            return false;
        }
        return true;
    }
}
