package D21.D21_T1_PassByValue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int givenInput1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the second number: ");
        int givenInput2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Input1: " + givenInput1 + ", Input2: " + givenInput2);

        Swapping swapsAB = new Swapping();
        swapsAB.swap(givenInput1,givenInput2);
        System.out.println("Swapped two numbers");

        System.out.println("Output1: " + swapsAB.swapped1 + ", Output2: " + swapsAB.swapped2);
        scanner.close();
    }


}