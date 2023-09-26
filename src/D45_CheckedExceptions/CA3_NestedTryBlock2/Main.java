package D45_CheckedExceptions.CA3_NestedTryBlock2;

public class Main {

    public static void main(String[] args) {

        // outer try
        try {

            // first inner try

            try {

                //second inner try
                try {
                    int numbers[] = {1, 2, 3, 4, 5};
                    System.out.println(numbers[19]);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception (second inner try" +e);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException (first inner try" + e) ;
            }

        } catch (Exception e) {
            System.out.println("Super type Exception (outer try" +e);
        }

    }
}
