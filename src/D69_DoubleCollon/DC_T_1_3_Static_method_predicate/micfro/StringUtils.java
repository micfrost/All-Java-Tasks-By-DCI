package D69_DoubleCollon.DC_T_1_3_Static_method_predicate.micfro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringUtils {
    // Static method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method to filter a list based on a given predicate
    public static void filterPalindromes(List<String> words, Predicate<String> predicate) {
        words.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        // Create a list of strings using ArrayList with different words
        List<String> wordList = new ArrayList<>(List.of("madam", "apple", "radar", "level", "hello"));

        // Use a static method reference to pass the isPalindrome method to filterPalindromes

        Predicate<String> palindromePredicate1 = StringUtils::isPalindrome;
        System.out.println("Palindromes1:");
        filterPalindromes(wordList, palindromePredicate1);


        Predicate<String> palindromePredicate2 = str -> isPalindrome(str);
        System.out.println("Palindromes2:");
        filterPalindromes(wordList, palindromePredicate2);
    }
}
