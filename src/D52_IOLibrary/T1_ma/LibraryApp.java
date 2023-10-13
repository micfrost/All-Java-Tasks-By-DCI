package library_system;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Book implements Serializable {
    String title;
    String author;
    String ISBN;
    boolean isAvailable;
    
    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }
}
class Person {
    String name;
    String contactInfo;
    
    public Person(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }
}
class LibraryMember extends Person {
    int memberID;
    
    public LibraryMember(String name, String contactInfo, int memberID) {
        super(name, contactInfo);
        this.memberID = memberID;
    }
}
class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void checkoutBook(Book book, LibraryMember member) {
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println(member.name + " checked out " + book.title);
        } else {
            System.out.println(book.title + " is not available for checkout.");
        }
    }
    public void returnBook(Book book) {
        if (!book.isAvailable) {
            book.isAvailable = true;
            System.out.println("Returned: " + book.title);
        }
    }
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println(book.title + " by " + book.author);
            }
        }
    }
}
public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        loadBookData(library);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Library Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Check out a book");
            System.out.println("3. Return a book");
            System.out.println("4. View available books");
            System.out.println("5. Save and exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String ISBN = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN, true));
                    break;
                case 2:
                    System.out.print("Enter the title of the book to check out: ");
                    String checkoutTitle = scanner.nextLine();
                    for (Book book : library.getBooks()) {
                        if (book.title.equals(checkoutTitle)) {
                            library.checkoutBook(book, new LibraryMember("Jonathan Davies", "joesaudo@hotmail.com", 123));
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    for (Book book : library.getBooks()) {
                        if (book.title.equals(returnTitle)) {
                            library.returnBook(book);
                            break;
                        }
                    }
                    break;
                case 4:
                    library.displayAvailableBooks();
                    break;
                case 5:
                    saveBookData(library);
                    System.out.println("Library data saved. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    private static void saveBookData(Library library) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("library_data.ser"))) {
            outputStream.writeObject(library.getBooks());
        } catch (IOException e) {
            System.err.println("Error saving book data: " + e.getMessage());
        }
    }
    private static void loadBookData(Library library) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("library_data.ser"))) {
            ArrayList<Book> books = (ArrayList<Book>) inputStream.readObject();
            library.setBooks(books);
        } catch (FileNotFoundException e) {
            library.setBooks(new ArrayList<>());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading book data: " + e.getMessage());
            library.setBooks(new ArrayList<>());
        }
    }
}







