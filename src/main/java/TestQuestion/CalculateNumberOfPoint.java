package TestQuestion;
//Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.
//
//- wins get 3 points
//- draws get 1 point
//- losses get 0 points


public class CalculateNumberOfPoint {
    public static void main(String[] args) {
        int a = footballPoints(3, 4, 2);
        System.out.println(a);
    }
    public static int footballPoints(int wins, int draws, int losses){
        int w = 3;
        int d  = 1;
        int l = 0;
        int points = wins * w + draws * d + losses * l;
        return points;
    }
}
