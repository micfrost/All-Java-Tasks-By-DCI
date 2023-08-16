package D23_For_Loops.D23_CA_NastedForLoop;

public class Main {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer Loop: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner Loop: " + j); // Executes 6 times (2 * 3)
            }
        }
    }
}
