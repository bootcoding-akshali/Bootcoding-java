package bootcoding.basicmatths.assignments;

public class HarmonicSeries {
    public static void main(String[] args) {
     printHarmonicSeries(5);
    }
    public static void printHarmonicSeries(double s){
        double sum = 0.0;
        for (int i=1 ; i<= s; i++){
            sum = sum + 1/i;
            System.out.println(sum);
        }
    }
}
