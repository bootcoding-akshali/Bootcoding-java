package bootcoding.basic.matths;

import java.util.Calendar;

public class FindDate extends java.util.Date {
    public static void main(String[] args) {
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(new FindDate());
        System.out.println("Today date : "+ endDate);
    }
}
