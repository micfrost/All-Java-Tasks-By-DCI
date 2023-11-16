package D69_DoubleCollon.DC_T_1_3_Static_method_predicate.dc;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class StringUtils {
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Main {

    static List<String> filterPalindromes(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("level", "hello", "radar", "world", "madam");

        List<String> palindromes = filterPalindromes(words, StringUtils::isPalindrome);

        System.out.println("Palindromes:");
        palindromes.forEach(System.out::println);
    }
}