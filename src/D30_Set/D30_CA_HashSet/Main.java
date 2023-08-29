package D30_Set.D30_CA_HashSet;

import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

/*

Java HashSet class implements the Set interface
It stores unique objects. It will not store duplicates.
You don't get an error, simply nothing happens, the element is discarded.
HashSet doesn't store elements in particular order.
There is no get method() to access a particular index.

 */

        HashSet<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("blueberry");
        fruits.add("watermelon");

        System.out.println(fruits.contains("kiwi"));
        System.out.println(fruits);

        for (String element : fruits) {
            System.out.println(element);
        }
    }
}
