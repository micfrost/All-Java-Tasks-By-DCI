package D63_64_Functional_Programming.DC_T_5_Lambda_Calculator.micfro;

import java.util.function.BiFunction;

@FunctionalInterface
interface Calculator {
    double mathOperation(double num1, double num2);
}

public class LambdaExercise {

    static double performOperation(double num1, double num2, Calculator calculatorOperation) {
        return calculatorOperation.mathOperation(num1, num2);
    }

    static double performOperation(double num1, double num2, BiFunction<Double, Double, Double> function) {
        return function.apply(num1, num2);
    }

    public static void main(String[] args) {
        Calculator calculatorAddition = ((num1, num2) -> num1 + num2);
        Calculator calculatorSubtraction = ((num1, num2) -> num1 - num2);
        BiFunction<Double, Double, Double> calculatorMultiplication = ((a, b) -> a * b);
        BiFunction<Double, Double, Double> calculatorDivision = ((a, b) -> a / b);

        System.out.println("- - -");
        System.out.print("Addition: ");
        System.out.println(performOperation(2, 4, calculatorAddition));

        System.out.print("Subtraction: ");
        System.out.println(performOperation(5, 7, calculatorSubtraction));

        System.out.print("Multiplication: ");
        System.out.println(performOperation(3, 9, calculatorMultiplication));

        System.out.print("Division: ");
        System.out.println(performOperation(2, 0, calculatorDivision));

    }
}
