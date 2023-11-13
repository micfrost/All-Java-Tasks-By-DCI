package D49_IO.T4_book;

//TODO
//EXCEPTIONS


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println("Library Management System.");
        System.out.println("The program allows users to add books to the library, check out books, return books, and view the list of available books.");
        System.out.println();


        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.userInterface();

    }
}
