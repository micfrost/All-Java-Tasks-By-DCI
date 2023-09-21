package D42_Date.D42_T2_FutureDatesCalculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EuropeanDateStyle {
    public static void main(String[] args) {
        System.out.println(" - - - ");
        System.out.println("Future Dates Calculator");
        System.out.println("A Java program that calculates future dates based on a given starting date and a number of days into the future.");
        System.out.println(" - - - ");

        //      Prompt the user to enter a starting date in the format "YYYY-MM-DD."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a starting date in the format \"DD.MM.YYYY.\": ");
        DateTimeFormatter europeanStyle = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String inputStartingDate = scanner.nextLine();

//        Prompt the user to enter the number of days into the future.
        System.out.println("Enter the number of days into the future: ");
        int inputFutureDays = Integer.valueOf(scanner.nextLine());

        //        Parse the user input into a LocalDate object representing their birthdate
        LocalDate startingDate = LocalDate.parse(inputStartingDate, europeanStyle);

//        Calculate the future date by adding the specified number of days to the starting date.
        LocalDate futureDate = startingDate.plusDays(inputFutureDays);

//        LocalDate futureDateFormatted = futureDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String futureDateFormatted =  futureDate.format(europeanStyle);

//        Display the calculated future date.
        System.out.println("Future date after " + inputFutureDays + " days: " + futureDateFormatted );
    }
}
