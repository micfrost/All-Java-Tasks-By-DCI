import java.util.regex.*;

public class D18_T11_1_Regex_CapitalLetter {
    public static void main(String[] args) {
        patternWordsStatsCapitalLetter();
    }

    private static void patternWordsStatsCapitalLetter() {
        String input = "Hello my name is Mathias";
        String pattern = "([A-Z])\\w+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        boolean foundMatch = false;

        while (matcher.find()) {
            if (!foundMatch) {
                System.out.println("Bingo: ");
                foundMatch = true;
            }
            String matchedWord = matcher.group();
            System.out.println("Matched: " + matchedWord);
        }

        if (!foundMatch) {
            System.out.println("No matches found.");
        }
    }
}
