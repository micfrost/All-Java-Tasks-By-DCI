package D63_64_Functional_Programming.DC_T_5_Lambda_Calculator.Jac;

import java.util.function.BiFunction;

public class LambdaExercise {

    public static Double performOperation(Double a, Double b, BiFunction<Double, Double, Double> function) {
        return function.apply(a, b);
    }

    public static void main(String[] args) {
        double x = 4;
        double y = 2;

//        directly passing lambda expression as a parameter
        System.out.printf("%,.2f + %,.2f = %,.2f\n", x, y, performOperation(x, y, (a, b) -> a + b));
        System.out.printf("%,.2f - %,.2f = %,.2f\n", x, y, performOperation(x, y, (a, b) -> a - b));

        //        not directly passing lambda expression as a parameter

        BiFunction<Double, Double, Double>  multi = ((a, b) -> a * b);

        System.out.printf("%,.2f %calcPackage %,.2f = %,.2f\n", x, '\u00d7', y, performOperation(x, y, multi));
        System.out.printf("%,.2f %calcPackage %,.2f = %,.2f\n", x, '\u00F7', y, performOperation(x, y, (a, b) -> a / b));
    }
}