package TestQuestion;
//Write a function that takes the base and height of a triangle and return its area.

// The area of a triangle is: (base * height) / 2 Don't forget to return the result.
public class AreaOfTriangle {
    public static void main(String[] args) {
        int i = returnArea(3, 6);
        System.out.println(i);
    }
    public static int returnArea(int h, int b){
        int area =(b*h)/2;
        return area;
    }
}
