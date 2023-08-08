package D20.D20_T1;

public class ArithmeticCalculator {
    double addition(double value1, double value2) {
        System.out.print("Addition: ");
        double result = value1+value2;
        System.out.print(value1 + " + " + value2 + " = ");
        return result;
    }

    double subtraction(double value1, double value2) {
        System.out.print("Subtraction: ");
        double result = value1-value2;
        System.out.print(value1 + " - " + value2 + " = ");
        return result;
    }

    double multiplication(double value1, double value2) {
        System.out.print("Multiplication: ");
        double result = value1*value2;
        System.out.print(value1 + " * " + value2 + " = ");
        return result;
    }

    double division(double value1, double value2) {
        System.out.print("Division: ");
        double result = value1/value2;
        System.out.print(value1 + " / " + value2 + " = ");
        return result;
    }

}
