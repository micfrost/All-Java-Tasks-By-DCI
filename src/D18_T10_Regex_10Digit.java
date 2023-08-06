import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class D18_T10_Regex_10Digit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a 10 digit numeric characters starting with 7, 8 or 9: ");
        String givenInput = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[7-9]\\d{9}$");

        Matcher matcher = pattern.matcher(givenInput);

        System.out.println("Input/Output");

        if (matcher.matches()) {
            System.out.println(givenInput + " --> true");
        } else {
            System.out.println(givenInput + " --> false");
        }

    }
}
