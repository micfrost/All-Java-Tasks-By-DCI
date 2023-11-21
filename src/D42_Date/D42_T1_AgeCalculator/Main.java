package D42_Date.D42_T1_AgeCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" - - - ");
        System.out.println("Age C1");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program that calculates a person's age based on their birthdate.");
        System.out.println(" - - - ");

//        Prompt the user to enter their birthdate in the format "YYYY-MM-DD."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth (YYYY-MM-DD): ");
        String inputString = scanner.nextLine();

//        Parse the user input into a LocalDate object representing their birthdate
        LocalDate dateOfBirth = LocalDate.parse(inputString);

//        Calculate the person's age by comparing their birthdate to the current date
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();

//        Display the person's age in years.
        System.out.println("You are " + age + " years old.");


    }
}
