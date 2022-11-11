package bootcoding.basicmatths;

public class Radius {
    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static void main(String[] args) {
        double Diameter = 5.0;
        double area = calculateArea(Diameter/2);
        System.out.println(area);
    }
}
