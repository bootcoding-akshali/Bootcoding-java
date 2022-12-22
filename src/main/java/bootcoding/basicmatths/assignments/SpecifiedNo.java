package bootcoding.basicmatths.assignments;

public class SpecifiedNo {
    public static void main(String[] args) {
      getRemainder(25);
    }
    public static void getRemainder(int r){
        for (int i=1; i<100; i++){
            if (i % r == 3){
                System.out.println(i);
            }
        }
    }
}
