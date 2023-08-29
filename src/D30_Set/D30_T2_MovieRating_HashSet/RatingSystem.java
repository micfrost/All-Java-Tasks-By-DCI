package D30_Set.D30_T2_MovieRating_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class RatingSystem {

    public void run() {
        HashSet<MovieRating> movieRatingHashSet = new HashSet<>();

        System.out.println("- - - - - ");
        System.out.println("A program that allows users to rate movies \nand view the unique movie ratings using a HashSet");

        String chosenOption;
        Scanner scanner = new Scanner(System.in);

        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addRating(scanner, movieRatingHashSet);
                case "2" -> display(movieRatingHashSet);
                case "3" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("3"));
    }

    private static void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add a new movie and its rating to the Set.");
        System.out.println("2. Display the unique movie ratings in the Set");
        System.out.println("3. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }

    static void addRating(Scanner scanner, HashSet<MovieRating> movieRatingHashSet) {
        System.out.println("- - - - - ");
        System.out.println("Add a title of a movie. ");
        String givenMovieTitle = scanner.nextLine();

        System.out.println("Add a rating of this movie. ");
        double givenRating = Double.parseDouble(scanner.nextLine());
        MovieRating movieRatingElement = new MovieRating(givenMovieTitle, givenRating);


        if (!movieRatingHashSet.contains(movieRatingElement)) {
            movieRatingHashSet.add(movieRatingElement);
            System.out.println("Movie rating added successfully. \nThanks for a rating.");
        } else {
            System.out.println("This movie rating already exists. \nNevertheless thanks for your feedback. ");
        }
    }

    static void display(HashSet<MovieRating> movieRatingHashSet) {
        for (MovieRating element : movieRatingHashSet
        ) {
            System.out.println(element);
        }
    }

    private static void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }

    private static void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}




