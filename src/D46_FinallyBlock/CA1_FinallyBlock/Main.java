package D46_FinallyBlock.CA1_FinallyBlock;

public class Main {

    public static void main(String[] args) {

        try {
            int number = 50 / 10;
            System.out.println(number);
//            this catch gonna be skipped because the exception is not thrown.
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("normal flow continues.");
    }
}
