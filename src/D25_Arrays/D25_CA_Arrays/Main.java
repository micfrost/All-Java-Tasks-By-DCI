package D25_Arrays.D25_CA_Arrays;

import javax.lang.model.element.Element;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("- - - ARRAYS OF INTEGERS - - - ");
        int[] numbers = {2, 6, 9, 1};

       /*
      Note: Array indexes start from zero.
       0. Oil
       1. Pasta
       2. Basil
       */

        System.out.println(numbers[0]);
        System.out.println();

        System.out.println("- - - ARRAYS OF STRINGS - - - ");
            /*
      Note: Array indexes start from zero.
       0. Bread
       1. Tomatoes
       2. Coffee
       3. Cheese

       String[] name - this is a recommended convention
       String name[] - this is not a recommended convention, but works also good
       */

        String[] shoppingList = {"Bread", "Tomatoes", "Coffee", "Cheese"};
//        System.out.println(shoppingList[0]);
        System.out.println("FOR LOOP");
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Index " + i + ": " + shoppingList[i]);
        }
        System.out.println();

//        Reassigning an array element (item)
        shoppingList[1] = "Grapes";

        System.out.println("AFTER CHANGING - USING ARRAYS.TOSTRING");
        System.out.println(Arrays.toString(shoppingList));
        System.out.println();


        System.out.println("FOR EACH LOOP - FRUITS");
        String[] fruits = {"apple", "pear", "kiwi"};
        int index=0;
        for (String fruit : fruits) {
            System.out.println("Index "  + (index++) + ": " + fruit );
        }
        System.out.println();

        int[] values = new int[4];
        System.out.println("Length: "+ values.length);
        values[0] = 5;
        values[1] = 32;
        values[2] = 77;
        for(int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

    }
}
