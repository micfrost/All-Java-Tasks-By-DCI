package D49_IO.T4_book;

import java.io.Serializable;

public class Book implements Serializable {

//    Book class: Represents a book with attributes such as title, author, ISBN, and availability status.

    private String title;
    private String author;
    private int ISBN;
    private boolean isAvailable;

    public Book(String title, String author, int isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }


    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book:" + "title: " + title +
                ", author: " + author + ", ISBN: " + ISBN +
                ", isAvailable: " + isAvailable;
    }
}
