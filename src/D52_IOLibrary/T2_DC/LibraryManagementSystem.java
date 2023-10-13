package D52_IOLibrary.T2_DC;


        import java.io.*;
        import java.util.ArrayList;
        import java.util.Scanner;

class Person {
    private String name;
    private String contactInfo;

    public Person(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}

class LibraryMember extends Person {
    public LibraryMember(String name, String contactInfo) {
        super(name, contactInfo);
    }
}

class Book implements Serializable {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkoutBook(Book book, LibraryMember member) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Sorry, the book is already checked out.");
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This book is already available in the library.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Load book data from a file (try-catch block)
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("book_records.txt"))) {
            library = (Library) inputStream.readObject();
            System.out.println("Library data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing library data found. Starting with an empty library.");
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Checkout a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter Book ISBN to checkout: ");
                    String checkoutIsbn = scanner.nextLine();
                    Book checkoutBook = findBookByISBN(library, checkoutIsbn);
                    if (checkoutBook != null) {
                        library.checkoutBook(checkoutBook, null); // Member information is not implemented in this example
                    } else {
                        System.out.println("Book with ISBN " + checkoutIsbn + " not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ISBN to return: ");
                    String returnIsbn = scanner.nextLine();
                    Book returnBook = findBookByISBN(library, returnIsbn);
                    if (returnBook != null) {
                        library.returnBook(returnBook);
                    } else {
                        System.out.println("Book with ISBN " + returnIsbn + " not found.");
                    }
                    break;
                case 4:
                    library.displayAvailableBooks();
                    break;
                case 5:
                    // Save library data to a file (try-catch block)
                    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("book_records.txt"))) {
                        outputStream.writeObject(library);
                        System.out.println("Library data saved successfully.");
                    } catch (IOException e) {
                        System.out.println("Error saving library data.");
                    }
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        System.out.println("Thank you for using the Library Management System.");
        scanner.close();
    }

    // Helper method to find a book by ISBN
    private static Book findBookByISBN(Library library, String isbn) {
        for (Book book : library.getBooks()) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
