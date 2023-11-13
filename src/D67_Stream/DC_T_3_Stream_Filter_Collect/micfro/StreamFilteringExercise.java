package D67_Stream.DC_T_3_Stream_Filter_Collect.micfro;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilteringExercise {

    static List<Book> filterAndCollect(List<Book> bookList, Predicate<Book> predicate) {
        return bookList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Book> bookList = List.of(new Book("Tomek Soyer", 1984), new Book("Tomek na scieszkach Yeti.", 1975), new Book("Tom any Jerry.", 2015));
        Predicate<Book> predicateYear = element -> element.getPublishYear() < 2000;

        System.out.println("Input List:");
        bookList.forEach(element -> System.out.println(element));
        System.out.println();

        List<Book> filteredList = filterAndCollect(bookList, predicateYear);

        System.out.println("Filtered list with books that meet the condition, \nPublished before 2000 :");
        filteredList.forEach(element -> System.out.println(element));
    }
}


class Book {

    String title;
    int publishYear;

    public Book(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    public double getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title + " - " + publishYear;
    }
}
