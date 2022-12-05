package TestQuestion;
//Write a method that takes an integer minutes and converts it to seconds.
public class ConvertSecond {
    public static void main(String[] args) {
        int i = toSec(5);
        System.out.println(i);
    }
    public static  int toSec(int min){
     int convert = min * 60;
          return convert;
    }
}
