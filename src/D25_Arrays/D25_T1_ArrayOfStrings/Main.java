package D25_Arrays.D25_T1_ArrayOfStrings;
public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "strawberry", "grape", "grapefruit", "watermelon", "pineapple"};
//        Print the Array
        System.out.println("String elements of an array: ");
        int index = 0;
        for (String word : words) {
            System.out.println("Index " + (index++) + ": " + word);
        }
        System.out.println();

//       Numbers of Characters which have the longest Word
        String longestString = null;
        for (int i = 1; i < (words.length); i++) {
            if (words[(i-1)].length() < words[(i)].length()) {
                longestString = words[i];
            }
        }
        System.out.println("The longest word has " + longestString.length() + " characters.");

//        Find out if there are more words as long as the longest one
        int count = 0;
        for (String word : words) {
            if (word.length() == longestString.length()) {
                count++;
            }
        }

//        Print the one longest word or the group of longest words
        if (count == 1) {
            System.out.println("The longest word in the array is: " + longestString);
        } else {
            System.out.println("There are " + count + " words which are " + longestString.length() + " characters long: ");
            for (String word : words) {
                if (word.length() == longestString.length()) {
                    System.out.println(word);
                }
            }
        }
    }
}
