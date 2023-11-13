package D67_Stream.DC_T_1_Stream_filter_count;

import java.util.List;
import java.util.function.Predicate;

public class StreamFilterCountExercise {

    static long filterAndCount(List<Book> bookList, Predicate predicate) {
        long count = bookList.stream().filter(predicate).count();
        return count;

    }


    public static void main(String[] args) {

        List<Book> bookList1 = List.of(new Book("Tomek Soyer", 5), new Book("Tomek na scieszkach Yeti.",15), new Book("Tom any Jerry.", 25));
        Predicate<Book> predicateTitle = element -> element.getTitle().contains("Tomek");
        Predicate<Book> predicatePrice = element -> element.getPrice() < 10;
        long countTitle = filterAndCount(bookList1, predicateTitle);
        long countPrice = filterAndCount(bookList1, predicatePrice);

        System.out.println("Input List:");
        bookList1.forEach(element -> System.out.println(element));
        System.out.println();


        System.out.println("Count of books that meet the filtering condition ( Tomek ): " + countTitle);
        System.out.println("Count of books that meet the filtering condition ( < 10€>): " + countPrice);
    }
}


