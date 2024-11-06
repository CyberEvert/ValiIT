package dayten;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatte {

    public static void main(String[] args) {

        //LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println(localDateTime);

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //System.out.println(formatter.format(localDateTime));

        //ZonedDateTime zonedDateTime = ZonedDateTime.now();
        //System.out.println(zonedDateTime);

        int year = LocalDateTime.now().getYear();
        System.out.println("Year: " + year);

        int month = LocalDateTime.now().getMonthValue();
        System.out.println("Month: " + month);

        int day = LocalDateTime.now().getDayOfMonth();
        System.out.println("Day: " + day);

        int hour = LocalDateTime.now().getHour();
        System.out.println("Hour: " + hour);

        int minute = LocalDateTime.now().getMinute();
        System.out.println("Minute: " + minute);

        int second = LocalDateTime.now().getSecond();
        System.out.println("Second: " + second);
    }
}
