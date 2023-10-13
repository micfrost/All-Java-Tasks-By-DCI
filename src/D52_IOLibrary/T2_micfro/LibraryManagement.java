package D52_IOLibrary.T2_micfro;

import java.io.IOException;
import java.util.Scanner;

public class LibraryManagement {
    Scanner scanner = new Scanner(System.in);

    void userInterface() throws IOException {

        String chosenOption;
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Login as an employee of a library.");
            System.out.println("2. Login as an admin of a library.");
            System.out.println("3. Exit");
            System.out.println("- - - - - ");
            System.out.print("Enter selected option: ");
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> loginEmployee();
                case "2" -> loginAdmin();
                case "3" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("3"));
    }

    private void loginEmployee() throws IOException {
        menuEmployee();
    }

    private void loginAdmin() {
        addEmployee();
    }

    private void menuEmployee() throws IOException {
        String chosenOptionEmployee;
        Library library = new Library();
        library.readBooksFromFile();
        do {
            System.out.println();
            System.out.println("Employee's Menu :");
            System.out.println("1. Add a book to the library's collection.");
            System.out.println("2. Mark a book as checked out.");
            System.out.println("3. Mark a book as returned.");
            System.out.println("4. Display a list of available books.");
            System.out.println("5. Save Book's records to a file.");
            System.out.println("6. Exit");
            System.out.println("- - - - - ");
            System.out.print("Enter selected option: ");
            chosenOptionEmployee = scanner.nextLine();
            switch (chosenOptionEmployee) {
                case "1" -> library.addBook();
                case "2" -> library.checkoutBook();
                case "3" -> library.returnBook();
                case "4" -> library.displayAvailableBooks();
                case "5" -> Library.writeBooksArrayToFile();
                case "6" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOptionEmployee.equals("6"));
    }

    private void addEmployee() {
        System.out.println("Add a new employee.");
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter an email: ");
        String email = scanner.nextLine();
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        LibraryEmployee employee = new LibraryEmployee(name, email, password);
        LibraryMember libraryMember = new LibraryMember();
        libraryMember.addMember(employee);
    }

    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }
    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}



