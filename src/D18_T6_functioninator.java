import java.util.Scanner;
public class D18_T6_functioninator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a single word: ");
        String givenWord = scanner.nextLine();
        System.out.println(givenWord + "inator" + " " + givenWord.length() + "000");

    }
}
