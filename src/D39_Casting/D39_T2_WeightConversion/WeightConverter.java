package D39_Casting.D39_T2_WeightConversion;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        System.out.println("Weight Conversion");
        System.out.println("S program that converts weights between different weight units by using type casting.");
        System.out.println("- - -");

        System.out.println("Enter a weight value");
        Scanner scanner = new Scanner(System.in);
        double inputWeights = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a weight units: kg (kilogram), g (gram), lb (pound), oz (ounces)");
        String inputWeightsUnits = scanner.nextLine();

        if(inputWeightsUnits.equals("kg")) {
            System.out.println(inputWeights + "kg is: " + (int)(inputWeights*1000) + "g."  );
        }
        if(inputWeightsUnits.equals("g")) {
            System.out.println((int)(inputWeights) + "g is: " + (inputWeights/1000) + "kg."  );
        }
        if(inputWeightsUnits.equals("lb")) {
            System.out.println((int)inputWeights + "lb is: " + (inputWeights*16) + "oz."  );
        }
        if(inputWeightsUnits.equals("oz")) {
            System.out.println(inputWeights + "oz is: " + (int)(inputWeights/16) + "lb."  );
        }
    }
}
