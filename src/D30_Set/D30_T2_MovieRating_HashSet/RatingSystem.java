package D30_Set.D30_T2_MovieRating_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class RatingSystem {
    Scanner scanner = new Scanner(System.in);
    HashSet<MovieRating> movieRatingHashSet = new HashSet<>();
    public void run() {


        System.out.println("- - - - - ");
        System.out.println("A program that allows users to rate movies \nand view the unique movie ratings using a HashSet");

        String chosenOption;


        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addRating();
                case "2" -> display();
                case "3" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("3"));
    }

    private void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add a new movie and its rating to the Set.");
        System.out.println("2. Display the unique movie ratings in the Set");
        System.out.println("3. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }

    private void addRating() {
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
            System.out.println("This movie rating to already exists. \nNevertheless thanks for your feedback. ");
        }
    }

    private void display() {
        for (MovieRating element : movieRatingHashSet
        ) {
            System.out.println(element);
        }
    }

    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }

    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}




