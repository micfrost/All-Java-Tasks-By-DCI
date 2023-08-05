import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D18_CA_RegEx {
    public static void main(String[] args) {

        String wordToFind = "w3schools";

        Pattern pattern = Pattern.compile(wordToFind, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found: " + wordToFind);
        } else {
            System.out.println("Match not found");
        }
    }
}
