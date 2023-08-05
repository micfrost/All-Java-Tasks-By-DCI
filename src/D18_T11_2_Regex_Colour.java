import java.util.regex.*;

public class D18_T11_2_Regex_Colour {
    public static void main(String[] args) {
        String input = "The color but in England, it's often called the colour.";
        String pattern = "colou?r";
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(input);

        while (matcher.find()) {
            String matchedWord = matcher.group();
            System.out.println("Matched: " + matchedWord);
        }
    }
}