package D73_SwitchExpressions.T_2_Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first operand: ");
        double firstNum = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a second operand: ");
        double secondNum = Double.valueOf(scanner.nextLine());
        System.out.println("Enter an operator: \n+ for addition, \n- for subtraction, \n* for multiplication, \n/ for division");
        String operator = scanner.nextLine();

        switch (operator) {
            case "+" -> System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
            case "-" -> System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
            case "*" -> System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
            case "/" -> System.out.println(secondNum != 0 ?
                    firstNum + " / " + secondNum + " = " + (firstNum / secondNum) :
                    "Wow this number is huge. " + firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
            default -> System.out.println("Sorry: Invalid input.");
        }

    }
}