package D63_64_Functional_Programming.DC_T_6_Lambda_Tempera.micfro;

interface TemperatureConversion {
    double calculateOutput(double inputUnit);
}

public class LambdaExercise {

    static double convertTemperature(TemperatureConversion temperatureConversion, double inputUnit) {
        return temperatureConversion.calculateOutput(inputUnit);
    }

    public static void main(String[] args) {

        // Lambda expressions for temperature conversions
        TemperatureConversion convCelsToFahr = inputUnit -> (inputUnit * 1.8) + 32;
        TemperatureConversion convFahrToCels = inputUnit -> (inputUnit - 32) / 1.8;

        System.out.println("Celsius into Fahrenheit.");
        double inputCels = 0;
        double fahr1 = convertTemperature(convCelsToFahr, inputCels);
        System.out.printf("Input: %.2f°C --> Output: %.2f °F\n\n", inputCels, fahr1);


        System.out.println("Fahrenheit into Celsius.");
        double inputFahr =100;
        double cels1 = convertTemperature(convFahrToCels, inputFahr);
        System.out.printf("Input: %.2f°F --> Output: %.2f °C\n\n",inputFahr, cels1);
    }


}

