import java.util.regex.*;
import java.util.Scanner;

public class D18_T13_Regex_trailing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide an input: ");
        String givenInput = scanner.nextLine();

        String inputRemovedLead = givenInput.replaceAll("^0+", "");

        String inputRemovedLeadTrail = inputRemovedLead;

        String regex = "^[\\d]+\\.[\\d]*[0]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputRemovedLead);
        boolean matchFound = matcher.find();
        if (matchFound) {
            inputRemovedLeadTrail = inputRemovedLead.replaceAll("[0]+$", "");
        }
        System.out.println("Input/Output");
        System.out.print(givenInput);
        System.out.print(" --> ");
        System.out.println(inputRemovedLeadTrail);

    }
}
