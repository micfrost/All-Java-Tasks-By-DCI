package D21.D21_T4_REcursion_Decreasing;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int givenInput = Integer.parseInt(scanner.nextLine());

        countingDown(givenInput);
        System.out.println("Countdown complete");
    }
    public static void countingDown(int start) {
        System.out.println(start);
        if(start != 1) {
            countingDown(start - 1);

        }}

//    public static int countingDown(int start) {
//        System.out.println(start);
//        if(start == 1) {
//            return 1;
//        }
//        return countingDown(start -1);
//    }
}
