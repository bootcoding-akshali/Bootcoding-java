package TestQuestion;
//Create a function that takes the age in years and returns the age in days
public class AgeYear {
    public static void main(String[] args) {
        int i = ageInDays(3);
        System.out.println(i);
    }
    public static int ageInDays(int age){
        int days = 365;
        if ( age != 0) {

            return age*days;
        }
        return age;
    }
}
