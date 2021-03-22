package day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {


        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        calendar.roll(Calendar.MONTH, -2);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
