package D52_IOLibrary.T2_micfro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    //    Library class: Manages a collection of books (use ArrayList) and provides methods for adding books, checking out books, returning books, and displaying the list of available books.

//    implement methods for the following operations in the Library class:

//    addBook(Book book): Adds a book to the library's collection.

//    checkoutBook(Book book, LibraryMember member): Marks a book as checked out by a library member.

//    returnBook(Book book): Marks a book as returned and available for checkout.

//            displayAvailableBooks(): Displays a list of available books in the library.
//

    Scanner scanner = new Scanner(System.in);

    private static ArrayList<Book> bookArrayList;

    public Library() {
        bookArrayList = new ArrayList<>();
    }

    public void addBook() {
        System.out.println("Enter a title: ");
        String title = scanner.nextLine();
        System.out.println("Enter an author: ");
        String author = scanner.nextLine();
        System.out.println("Enter an ISBN: ");
        int isbn = Integer.parseInt(scanner.nextLine());
        System.out.println("Is the book available in the library? true or false");
        boolean isAvailable = Boolean.parseBoolean(scanner.nextLine());
        Book book = new Book(title, author, isbn, isAvailable);
        bookArrayList.add(book);
    }

    public void checkoutBook() {
        System.out.println("Enter a title of a book you want to check out: ");
        String title = scanner.nextLine();
        for (Book book : bookArrayList) {
            if (book.getTitle().equals(title)) {

                if (book.getIsAvailable()) {
                    book.setAvailable(false);
                    System.out.println("The book checked out successfully.");
                } else {
                    System.out.println("The book is not available.");
                }
            } else {
                System.out.println("The book was not found in a library catalog.");
            }
        }
    }

    void returnBook() {
        System.out.println("Enter a title of a book you want to return: ");
        String title = scanner.nextLine();
        for (Book book : bookArrayList) {
            if (book.getTitle().equals(title)) {
                if (book.getIsAvailable()) {
                    book.setAvailable(true);
                    System.out.println("The book return successfully.");
                } else {
                    System.out.println("The book was already returned and is available.");
                }
            } else {
                System.out.println("The book was not found in a library catalog.");
            }
        }
    }

    void displayAvailableBooks() {
        for (Book book : bookArrayList) {
            System.out.println(book);
        }
    }


    static String fileName = "//home//dci-student//IdeaProjects//JavaFbw//src//D52_IOLibrary//T2_micfro//DB_Books.ser";

    public void writeBooksArrayToFile() throws IOException {

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bookArrayList);
            objectOutputStream.close();
            fileOutputStream.close();
//            for (Book book : bookArrayList) {
//                objectOutputStream.writeObject(book);
//            }

            System.out.println("Books written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Oh no: " + e);
        }
    }


    public void readBooksFromFile() {
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            bookArrayList = (ArrayList<Book>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Books read from the file successfully.");

            // Display the read objects
            for (Book book : bookArrayList) {
                System.out.println(book);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Oh no: " + e);
        }
    }
}









