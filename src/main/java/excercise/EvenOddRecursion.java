package excercise;

public class EvenOddRecursion {
    public static void main(String[] args) {
     checkEvenOdd(2,5);
    }
    public static void checkEvenOdd(int a , int b){
      if (a<b){
          return;
      }
        if (a % 2 ==0){
            System.out.println(a+" ");
           checkEvenOdd(a,a-1);
        }

    }
}
