package D69_DoubleCollon.DC_T_1_1_Static_method;

//  Create a functional interface MathOperation with a single abstract method that takes two integers and returns an integer result.
@FunctionalInterface
interface MathOperation {

    int doSomeMath(int num1, int num2);
}

public class Main {
//  Implement three static methods:
    static int addNumbers(int n1, int n2) {
        return n1 + n2;
    }

    static int subtractNumbers(int n1, int n2) {
        return n1 - n2;
    }
    static int multiplyNumbers(int n1, int n2) {
        return n1 * n2;
    }


//    Create a method performOperation that takes two integers and a MathOperation interface implementation. This method should apply the given operation and return the result.
    static int performOperation(int number1, int number2, MathOperation selectedMathOperation) {
        return selectedMathOperation.doSomeMath(number1, number2);
    }

    public static void main(String[] args) {
//        In the main method:
//Use a lambda expression to pass the addNumbers method to performOperation.
//Use a method reference to pass the subtractNumbers method to performOperation.
//Use a method reference to pass the multiplyNumbers method to performOperation.

        MathOperation operationAdd = (a,b) -> addNumbers(a,b);
        MathOperation operationSub = Main::subtractNumbers;
        MathOperation operationMultiply = Main::multiplyNumbers;

        int resultAdd = performOperation(4, 5, operationAdd);
        int resultSubtract = performOperation(4, 5, operationSub);
        int resultMultiply = performOperation(4, 5, Main::multiplyNumbers);

        System.out.println("Addition 4+5: " + resultAdd);
        System.out.println("Subtraction 4-5: " + resultSubtract);
        System.out.println("Multiplication 4*5: " + resultMultiply);
    }
}
