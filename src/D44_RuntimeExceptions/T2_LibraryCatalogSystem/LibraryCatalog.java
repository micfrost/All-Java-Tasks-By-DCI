package D44_RuntimeExceptions.T2_LibraryCatalogSystem;

public class LibraryCatalog {
    private String[] bookTitles;

    //    a constructor that initializes the bookTitles array with some book titles
    public LibraryCatalog() {
        bookTitles = new String[]{"Book 1", "Book 2", "Book 3"};
    }

    //    Using a default exception -  without throwing a new exception
    String searchBookDefaultExc(int index) {
        try {
            return bookTitles[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Unfortunately the index is not in range of the Array.";
        }
    }

    //    Using a custom exception - throwing a new exception
    String searchBookCustomExc(int index) {
        try {
            if (index >= 0 && index < bookTitles.length) {
                return bookTitles[index];
            } else {
                throw new ArrayIndexOutOfBoundsException("Wrong index.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
    }
}
