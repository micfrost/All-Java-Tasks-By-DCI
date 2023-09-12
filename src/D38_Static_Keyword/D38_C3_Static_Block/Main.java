package D38_Static_Keyword.D38_C3_Static_Block;

public class Main {

    final static int NUMBER;

//    Static Block: - it is executed before a main method.
    static {
        NUMBER = 10;
        System.out.println("Hello from static block.");
    }

    public static void main(String[] args) {
        System.out.println("Hello from main.");
    }
}
