package bootcoding.basic.matths;

public class CalculateDistance {

    public static double distance
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(distance(3,4,6,8));
    }
}
