package D45_Exceptions_Multiple.T1_MultipleExceptions;

import java.util.*;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Handling Multiple Exceptions in Java");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter an integer");
//            InputMismatchException
            int givenInt = scanner.nextInt();

            double dividingByZero = (double) 5/givenInt;
//            ArithmeticException
            System.out.println(dividingByZero);

//             ArrayIndexOutOfBoundsException
            int[] simpleArrayOfIntegers = {0,1,2,3,};
            System.out.println(simpleArrayOfIntegers[3]);
        }

//        Handle the InputMismatchException that may occur when the user enters something other than an integer.
        catch (InputMismatchException e) {
            System.out.println("Wrong: InputMismatch");
        }
//        Handle the ArithmeticException that may occur when the user attempts to divide the input by zero.
        catch (ArithmeticException e) {
            System.out.println("Wrong: Dividing an Integer by 0 in not allowed");
        }
//        Handle the ArrayIndexOutOfBoundsException that may occur if an array is accessed incorrectly.
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong: ArrayIndexOutOfBounds");
        }
        catch (Exception e) {
            System.out.println("Wrong: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
