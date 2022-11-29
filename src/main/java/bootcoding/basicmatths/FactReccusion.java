package bootcoding.basicmatths;

public class FactReccusion {
    public static void main(String[] args) {
        long r =  getFact(2);
        System.out.println(r);
    }
    public  static  long getFact(int n){
        if (n==1)
            return 1;
        return  n * getFact(n-1);
    }
}
