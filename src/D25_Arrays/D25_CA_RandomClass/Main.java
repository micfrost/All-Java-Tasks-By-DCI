package D25_Arrays.D25_CA_RandomClass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create an instance of Random class
        Random random = new Random();

        // Generate random integer in range 0 to 999
        System.out.println("- - - RANDOM INTEGER - - -");

        int randomNum1 = random.nextInt(1000);
        int randomNum2 = random.nextInt(1000);
        System.out.println(randomNum1);
        System.out.println(randomNum2);
        System.out.println();

        // Generate a number in a defined range
        int max = 1000, min = 100;
        System.out.println("Generated numbers are within " + min + " to " + max);
        System.out.println(random.nextInt(max - min + 1) + min);
        System.out.println();


        // Generate random doubles in range 0.0 to 9.0
        System.out.println("- - - RANDOM DOUBLE - - -");
        double randomDouble1 = random.nextDouble(10.0);
        System.out.println("Random Double 1: " + randomDouble1);
        double randomDouble2 = random.nextDouble();
        System.out.println("Random Double 2: " + randomDouble2);

    }
}
