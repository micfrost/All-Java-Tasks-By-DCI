import java.util.Scanner;
import java.util.regex.*;

public class D18_T12_Regex_MathExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a mathematical expression: ");
        String givenInput = scanner.nextLine();

        String pattern = "^-?\\d+\\s?[+\\-*]\\s?-?\\d+$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(givenInput);
        if (matcher.find()) {
            System.out.println("Input/Output");
            System.out.print(givenInput + " --> ");
            System.out.println("true");
        } else {
            System.out.println("Input/Output");
            System.out.print(givenInput + " --> ");
            System.out.println("false");
        }
    }
}
