package D29_LinkedList.D29_T3_ConctactList;

import java.util.Scanner;
public class UserInterface {

    public void userInterface() {

        ContactList contactList2 = new ContactList();

        String chosenOption;
        Scanner scanner = new Scanner(System.in);

        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addContactWithScanner(scanner, contactList2);
                case "2" -> searchContactWithScanner(scanner, contactList2);
                case "3" -> contactList2.displayList();
                case "4" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("4"));
    }

    private static void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add a new contact to the list.");
        System.out.println("2. Search a name in the list.");
        System.out.println("3. Display all contacts in the list.");
        System.out.println("4. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }

    static void addContactWithScanner(Scanner scanner, ContactList contactList2) {
        System.out.println("- - - - - ");
        System.out.println("Add a Name of a contact. ");
        String givenName = scanner.nextLine();
        System.out.println("Add a phone number of a contact. ");
        String givenPhoneNumber = scanner.nextLine();

        contactList2.addContact(givenName, givenPhoneNumber);
        System.out.printf("Name : %s, \t Phone Number: %s.\n", givenName, givenPhoneNumber);
        System.out.println("Added successfully.");
    }

    static void searchContactWithScanner(Scanner scanner, ContactList contactList2) {
        System.out.println("- - - - - ");
        System.out.println("Enter a Name for a search: ");
        String inputSearchName = scanner.nextLine();
        contactList2.searchContact(inputSearchName);
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
