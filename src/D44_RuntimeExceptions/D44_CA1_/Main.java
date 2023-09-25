package D44_RuntimeExceptions.D44_CA1_;

public class Main {

    public static void main(String[] args) {

//      ArithmeticException
//      int a = 23 / 0;
//      System.out.println(a);

//      NullPointerException
//      String text = null;
//      System.out.println(text.length());
        
//      ArrayIndexOutOfBoundsException
//      int numbers[] = new int[7];
//      numbers[9] = 58;

//      NumberFormatException
//      String text = "Text";
//      int number = Integer.parseInt(text);


        try {
            System.out.println("- - -");
            System.out.println("TRY - CATCH");
            System.out.println("Text before an exception");

            int value = 87 / 0;
            System.out.println("Text after an exception - is not going print");

        } catch(Exception e) {

            System.out.println("- - -");
            System.out.println("Oh no an exception: " + e);
            System.out.println("Can not be devided by zero");
            System.out.println("Try again");
            System.out.println("- - -");
        }
        System.out.println("Rest of the code after successfully catching");
        System.out.println("- - -");
    }
}
