package D44_RuntimeExceptions.T2_LibraryCatalogSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("A Library Catalog System");
        System.out.println();

LibraryCatalog libraryCatalog = new LibraryCatalog();

        System.out.println("- - - ");
        System.out.println("1. Using a default exception -  without throwing a new exception");

        System.out.println(libraryCatalog.searchBookDefaultExc(0));
        System.out.println(libraryCatalog.searchBookDefaultExc(1));
        System.out.println(libraryCatalog.searchBookDefaultExc(2));
        System.out.println(libraryCatalog.searchBookDefaultExc(3));

        System.out.println("- - - ");
        System.out.println("2. Using a custom exception - throwing a new exception");
        System.out.println(libraryCatalog.searchBookCustomExc(0));
        System.out.println(libraryCatalog.searchBookCustomExc(1));
        System.out.println(libraryCatalog.searchBookCustomExc(2));
        System.out.println(libraryCatalog.searchBookCustomExc(3));

    }
}
