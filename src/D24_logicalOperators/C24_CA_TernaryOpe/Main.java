package D24_logicalOperators.C24_CA_TernaryOpe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a type ");
        int temp = scanner.nextInt();

        String weather = (temp >= 40) ? "Very hot!" : ( temp >= 25) ? "Normal Hot!" : (temp >= 0) ? "Cold!" : "Frost";
        System.out.println("Today is: " + weather);

    }
}
