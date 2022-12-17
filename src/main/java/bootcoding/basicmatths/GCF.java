package bootcoding.basicmatths;

public class GCF {
    public static void main(String[] args) {
        int number = 10;
        int a = 25;
        int b = 20;
        for (int i = 1; i < a && i < b ; i++){
            if (a % number  == 0 && b % number ==0){
                System.out.println("GCF" +a +b);
            }
        }
    }
}
