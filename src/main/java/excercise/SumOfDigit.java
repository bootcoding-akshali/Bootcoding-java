package excercise;

public class SumOfDigit {
    public static void main(String[] args) {
//        int n = 567;
//        System.out.print("Sum of digits : "+ addDigit(n));
       // int i = addDigits(38);
       // System.out.println(i);
        int num = 88;
        System.out.println(num == 0 ? 0 : 1 + (num - 1) % 9);
//        int res = addDigitsIntoSingleDigit(998989);
//        System.out.println(res);


    }
    public static int addDigitsIntoSingleDigit (int num){
        int sum = 0;
        if(num > 0 && num < 9){
            return num;
        }
        while(num != 0){
            int d = num % 10;
            sum = sum + d;
            num = num / 10;
            if(num == 0 && sum > 9){
                System.out.println("sum = " + sum);
                num = sum;
                sum = 0;
            }
        }

        return sum;
    }


//    private static int addDigit(int no)
//    {
//        if (no == 0)
//        {
//            return 0;
//        }
//        return (no % 10 + addDigit(no / 10));
//    }
        public static int addDigits(int num) {
          while (num==0){
              return 0;
          }
          return (num % 10 + addDigits(num/10));

}

}
