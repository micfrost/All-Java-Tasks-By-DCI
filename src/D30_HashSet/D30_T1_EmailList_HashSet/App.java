package D30_HashSet.D30_T1_EmailList_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class App {

    public void run() {
        HashSet<String> emailAddresses = new HashSet<>();

        System.out.println("- - - - - ");
        System.out.println("DC_T_1_ReantrantLock_Inside program that allows users to add email addresses to a list\n and then displays the unique email addresses in the list.");

        String chosenOption;
        Scanner scanner = new Scanner(System.in);

        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addEmail(scanner, emailAddresses);
                case "2" -> display(emailAddresses);
                case "3" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("3"));
    }

    private static void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add a new Email Address.");
        System.out.println("2. Display all unique Email Addresses in the list.");
        System.out.println("3. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }

    static void addEmail(Scanner scanner, HashSet<String> emailAddresses) {
        System.out.println("- - - - - ");
        System.out.println("Add an Email Address. ");
        String givenEmail = scanner.nextLine();
        if (!emailAddresses.contains(givenEmail)) {
            System.out.printf("Email: %s.\n", givenEmail);
            System.out.println("Added successfully.");
        } else {
            System.out.println("The Email Address already exist in the list");
        }
        emailAddresses.add(givenEmail);
    }

    static void display(HashSet<String> emailAddresses) {
        for (String element : emailAddresses
        ) {
            System.out.println(element);
        }
    }

    private static void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }

    private static void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}



