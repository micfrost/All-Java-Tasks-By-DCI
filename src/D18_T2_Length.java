import java.util.Scanner;

public class D18_T2_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a String: ");
        String givenWord = scanner.nextLine();
        System.out.println();

        int lenghtOfWord = givenWord.length();
        if (lenghtOfWord % 2 == 1) {
            System.out.println("\"" + givenWord + "\"" + " --> " + "\"odd\"");

        } else {
            System.out.println("\"" + givenWord + "\"" + " --> " + "\"even\"");

        }
    }
}
