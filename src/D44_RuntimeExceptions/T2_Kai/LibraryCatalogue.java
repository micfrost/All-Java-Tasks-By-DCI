package D44_RuntimeExceptions.T2_Kai;

import java.util.Scanner;

public class LibraryCatalogue {

    private String[] bookTitles;

    LibraryCatalogue() {
        bookTitles = new String[]
                {"The Historian", "The City of Your Final Destination", "A Fistful of Gitannes", "Anno Dracula", "Of Gramatology",
                        "Life of Pi", "First Love, Last Rites", "The Big Sleep", "The Wandering Ghost", "The Order of Things"};
    }

    public String searchBook(int index) {

        try {
            if(index >= 0 && index < bookTitles.length) {
               return bookTitles[index];

            } else {
                throw new ArrayIndexOutOfBoundsException("No book at this index");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {

        LibraryCatalogue catalogue = new LibraryCatalogue();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the index of the book you are looking for: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.println(catalogue.searchBook(index));;

        scanner.close();

    }
}