package D73_SwitchExpressions.T_3_MathOper.bard;


import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter the second operand: ");
        double operand2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        String result = performOperation(operand1, operand2, operator);
        System.out.println(result);
    }

    private static String performOperation(double operand1, double operand2, char operator) {
        return switch (operator) {
            case '+' -> String.valueOf(operand1 + operand2);
            case '-' -> String.valueOf(operand1 - operand2);
            case '*' -> String.valueOf(operand1 * operand2);
            case '/' -> operand2 != 0 ? String.valueOf(operand1 / operand2) : "Error: Division by zero.";
            default -> "Error: Invalid operator.";
        };
    }
}