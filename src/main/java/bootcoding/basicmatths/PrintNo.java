package bootcoding.basicmatths;

public class PrintNo {
    public static void main(String[] args) {


        int numberOfSteps = getNumberOfStepsToMakeZero(50);


        String s = "JLKJDsglksd";
        String s1 = s.toLowerCase();
        System.out.println(s1);

    }

    private static int getNumberOfStepsToMakeZero(int i) {
        int count=0;
        int number = 50;
        int temp = number;

        while (number != 0) {
            count++;
            if (number % 2 == 0) { //even
                number = number / 2;
            } else {
                number = number - 1;
            }

            System.out.println(number);
        }
        System.out.println("Number of steps to Reduce "+temp+"  to 0 is "+ count);
             return 9;
    }
}