package D45_CheckedExceptions.CA2_NestedTryBlock;

public class Main {
    public static void main(String[] args) {
//        outer try
        try {
//            first inner try
            try {
                int number = 68 / 0;
//                After the exception is thrown the code is terminated and java will try to catch it (searching for a catch).
                System.out.println("Hello");
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
//            second inner try ,
            try {
                int values[] = new int[10];
                values[11] = 10;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("another statement");
        }
//        outer catch
        catch (Exception e) {
            System.out.println("Super type Exception from outer");
        }
        System.out.println("Rest of the code.");
    }
}
