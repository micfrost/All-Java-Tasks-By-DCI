package D45_CheckedExceptions.CA1_MultiCatchBlock;

public class Main {
    public static void main(String[] args) {

        try {
            int numbers[] = new int[6];
            numbers[6] =70/0;

//      Hierarchy of Exceptions
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("The rest of the Code.");

    }
}
