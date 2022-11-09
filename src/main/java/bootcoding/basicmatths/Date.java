package bootcoding.basicmatths;

import java.util.Calendar;

public class Date extends java.util.Date {
    public static void main(String[] args) {
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(new Date());
        System.out.println("Today date : "+ endDate);
    }
}
