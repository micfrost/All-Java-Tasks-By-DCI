package D52_IOLibrary.T1_micfro;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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
