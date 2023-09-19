package D42_Date.D42_CA1_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

//        LocalDate.now()
        System.out.println("- - - - -");
        System.out.println("LocalDate.now()");
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);

        System.out.println("Today: " + date);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Tomorrow: " + tomorrow);

//        LocalDate.of()
        System.out.println("- - - - -");
        System.out.println("LocalDate.of()");
        LocalDate date1 = LocalDate.of(2023,2,24);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2020,2,24);
        System.out.println("The Year: " + date2 + ".Is it a Leap Year? " + date2.isLeapYear());

//        Adding Time - LocalDateTime = LocalDate.of().atTime()
        System.out.println("- - - - -");
        System.out.println("LocalDateTime for adding a time");
        LocalDate date3 = LocalDate.of(2023,9,11);

        LocalDateTime dateTime = date3.atTime(1,43,8); //available only in LocalDateTime class.
        System.out.println(dateTime);

        //        Converting LocalDate to String
        System.out.println("- - - - -");
        System.out.println("DateTimeFormatter to String");
        LocalDate date4 =LocalDate.now();
        String convertedToString = date4.format(DateTimeFormatter.ISO_DATE);
        System.out.println(date4);

        //        Converting String to LocalDate
        System.out.println("- - - - -");
        System.out.println("Converting String to LocalDate");
        String stringDate = "2020-08-02";
        LocalDate date5 = LocalDate.parse(stringDate);
        System.out.println("String to LocalDate: " + date5);

        //      Check if a date is after another date
        System.out.println("- - -");
        System.out.println("Check if a date is after another date");
        LocalDate date6 = LocalDate.parse("2023-05-23");
        LocalDate date7 = LocalDate.parse("2023-05-29");
        System.out.println(date6.isAfter(date7));


    }
}
