package D42_Date.D42_T3_;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(" - - - ");
        System.out.println("Day of the Week Calculator");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program that calculates the day of the week for a given date.");
        System.out.println(" - - - ");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //      Prompt the user to enter a date in the format "YYYY.MM.DD""
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in the format \"YYYY-MM-DD\": ");
        String inputDate = scanner.nextLine();

//        Parse the user input into a LocalDate object.

        LocalDate date = LocalDate.parse(inputDate, dateTimeFormatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfWeekString = dayOfWeek.toString();
        System.out.println("This is " + dayOfWeekString);

        int dayOfWeekInt = date.getDayOfWeek().getValue();
        System.out.print("and this is a " + dayOfWeekInt + ". day of a week.");

    }
}
