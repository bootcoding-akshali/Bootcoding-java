import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Enter String to Reverse Name ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        String s[] = str.split(" ");

        for (String value : s) {
            rev = value + " " + rev;
        }

        System.out.println("Reversed sentence: " + rev);
    }
    }

