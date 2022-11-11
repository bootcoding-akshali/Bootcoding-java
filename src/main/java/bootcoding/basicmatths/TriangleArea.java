package bootcoding.basicmatths;

public class TriangleArea {

    public static void areaOfTriangle(double base, double height){
        double area;
        area= base*height/2;
        System.out.println("Area of Triangle is :"+area);
    }

    public static void main(String[] args) {
        areaOfTriangle(2,5);
    }
}
