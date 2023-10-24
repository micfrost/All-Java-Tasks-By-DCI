package D42_Date.D42_T2_FutureDatesCalculator;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" - - - ");
        System.out.println("Future Dates Calculator");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program that calculates future dates based on a given starting date and a number of days into the future.");
        System.out.println(" - - - ");

        //      Prompt the user to enter a starting date in the format "YYYY-MM-DD."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a starting date in the format \"YYYY-MM-DD.\": ");
        String inputStartingDate = scanner.nextLine();

//        Prompt the user to enter the number of days into the future.
        System.out.println("Enter the number of days into the future: ");
        int inputFutureDays;

        try {
             inputFutureDays = Integer.valueOf(scanner.nextLine());
            //        Parse the user input into a LocalDate object representing their birthdate
            LocalDate startingDate = LocalDate.parse(inputStartingDate);

//        Calculate the future date by adding the specified number of days to the starting date.
            LocalDate futureDate = startingDate.plusDays(inputFutureDays);

//        Display the calculated future date.
            System.out.println(futureDate);
        }
        catch (NumberFormatException e) {
            System.err.println("Invalid input. Try one more time and enter the number of correctly: ");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}