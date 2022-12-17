package test.question;
// A vehicle needs 10 times the amount of fuel than the distance it travels.
//
//         However, it must always carry a minimum of 100 fuel.
//
//         Create a function which calculates the amount of fuel it needs, given the distance.
//
//         Notes Distance will be a number greater than zero. Return 100 if the calculated fuel turns out to be less than 100.
public class CalculateDistance {
    public static void main(String[] args) {
   calculateFuel(30);
    }
    public static void calculateFuel(int dist){
         if(dist != 0)
      {
        if (dist <=10){
            System.out.println(100);
        } else if (dist > 10) {
            int i = dist * 10;
            System.out.println(i);
        }

    }
     else{
    System.out.println("distance is Invalid");
     }
    }
}
