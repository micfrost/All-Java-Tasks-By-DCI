package D19_T3_CelsFahrenConverter;

import java.util.Scanner;

public class TemperatureConverter {
    void convertToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a temperature in Celsius: ");
        double givenTempInCelsius = Double.parseDouble(scanner.nextLine());

        double TempInFahrenheit = (givenTempInCelsius * 9/5) + 32;
        System.out.println("Given temperature in Celsius: " + givenTempInCelsius);
        System.out.println("Converted temperature in Fahrenheit: " + TempInFahrenheit);

    }
}
