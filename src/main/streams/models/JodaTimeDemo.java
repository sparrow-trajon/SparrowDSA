package models;

import java.time.*;

public class JodaTimeDemo {

    public static void main(String[] args) {

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);

        int day= localDate.getDayOfMonth();
        int month=localDate.getMonthValue();
        int year=localDate.getYear();
        System.out.printf("%d-%d-%d\n", day,month,year);

        int hour=localTime.getHour();
        int minute=localTime.getMinute();
        int sec= localTime.getSecond();
        System.out.printf("%d : %d : %d\n", hour,minute,sec);


        /***
         * LocalDateTime
         */

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);


        LocalDateTime ll= LocalDateTime.of(2020,Month.MARCH,20,20,30);
        System.out.println(ll.getDayOfWeek());


        LocalDate dob= LocalDate.of(1992,04,18);
        Period period= Period.between(dob,localDate);
        System.out.println(period);

    }
}
