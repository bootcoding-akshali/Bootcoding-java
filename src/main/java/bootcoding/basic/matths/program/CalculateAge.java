package bootcoding.basic.matths.program;


import java.util.Calendar;
import java.util.Date;

public class CalculateAge {
    public static void main(String[] args) {

        getAge();
    }

    public static void getAge()
    {
        Calendar cDate = Calendar.getInstance();
        cDate.setTime(new Date());

        Calendar bDate = Calendar.getInstance();
        bDate.set(1998,5,10);

        long years= cDate.get(Calendar.YEAR)-bDate.get(Calendar.YEAR);
        System.out.println(years);

        System.out.println("Your Age is :"+ years);

    }

}
