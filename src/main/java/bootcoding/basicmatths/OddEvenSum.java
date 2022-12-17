package bootcoding.basicmatths;

public class OddEvenSum {
    public static void main(String[] args) {
      sumOfOddEven();
    }
    public  static  void sumOfOddEven(){
      int n=10;
      int sumEven=0;
      int sumOdd=0;
      for ( int i=1; i<=n; i++){
          if (i%2 == 0){
              sumEven += i;
          }
          else {
              sumOdd += i;
          }
      }
        System.out.println("Even no"+ sumEven);
        System.out.println("Odd no"+ sumOdd);

    }
}
