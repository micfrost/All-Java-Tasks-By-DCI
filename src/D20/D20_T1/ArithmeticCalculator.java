package D20.D20_T1;

public class ArithmeticCalculator {
    double add(double value1, double value2) {
        System.out.print("Addition: ");
        double result = value1+value2;
        System.out.print(value1 + " + " + value2 + " = ");
        return result;
    }

    double subtract(double value1, double value2) {
        System.out.print("Subtraction: ");
        double result = value1-value2;
        System.out.print(value1 + " - " + value2 + " = ");
        return result;
    }

    double multiply(double value1, double value2) {
        System.out.print("Multiplication: ");
        double result = value1*value2;
        System.out.print(value1 + " * " + value2 + " = ");
        return result;
    }

    double divide(double value1, double value2) {
        System.out.print("Division: ");
        double result = value1/value2;
        System.out.print(value1 + " / " + value2 + " = ");
        return result;
    }

}
