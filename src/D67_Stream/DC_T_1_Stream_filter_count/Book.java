package D67_Stream.DC_T_1_Stream_filter_count;

public class Book {

    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title +                " - " + price +
                '€';
    }
}
