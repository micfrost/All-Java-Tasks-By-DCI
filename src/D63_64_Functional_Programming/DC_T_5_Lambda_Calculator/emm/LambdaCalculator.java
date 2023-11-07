package D63_64_Functional_Programming.DC_T_5_Lambda_Calculator.emm;

import java.util.function.BiFunction;
public class LambdaCalculator {
    public static void main(String[] args) {

        var calculator = new LambdaCalculator();

        System.out.print("Addition: ");
        System.out.print(calculate(17, 18, calculator.add) + "\n");

        System.out.print("Subtraction: ");
        System.out.print(calculate(60, 18, calculator.subtract) + "\n");

        System.out.print("Multiplication: ");
        System.out.print(calculate(11, 11, calculator.multiply) + "\n");

        System.out.print("Division: ");
        System.out.print(calculate(121, 11, calculator.divide) + "\n");
    }

    static double calculate(double a, double b, BiFunction<Double, Double, Double> function) {

        return function.apply(a, b);
    }

    BiFunction<Double, Double, Double> add = (a, b) -> a + b;

    BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;

    BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;

    BiFunction<Double, Double, Double> divide = (a, b) -> a / b;
}