package D63_64_Functional_Programming.DC_T_6_Lambda_Tempera.dc;

interface TemperatureConversion {
        double convert(double temperatureCelsius);
        }

public class LambdaExercise {

    public static double convertTemperature(TemperatureConversion conversion, double temperatureCelsius) {
        return conversion.convert(temperatureCelsius);
    }

    public static void main(String[] args) {

        // Lambda expressions for temperature conversions
        TemperatureConversion celsiusToFahrenheit = (temperatureCelsius) -> temperatureCelsius * 9/5 + 32;
        TemperatureConversion fahrenheitToCelsius = (temperatureCelsius) -> (temperatureCelsius - 32) * 5/9;

        // Convert Celsius to Fahrenheit
        double celsiusValue = 0;
        double fahrenheitResult = convertTemperature(celsiusToFahrenheit, celsiusValue);

        // Convert Fahrenheit to Celsius
        double fahrenheitValue = 100;
        double celsiusResult = convertTemperature(fahrenheitToCelsius, fahrenheitValue);

        // Print the results
        System.out.println("0 degrees Celsius in Fahrenheit: " + fahrenheitResult);
        System.out.println("100 degrees Fahrenheit in Celsius: " + celsiusResult);
    }
}