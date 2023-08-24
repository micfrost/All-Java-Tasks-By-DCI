package D28_ArrayList.D28_CA_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

//        int --> Integer

        ArrayList<Integer> arrList = new ArrayList<>();

//        these items are indexes just like in arrays add(element)
        arrList.add(9);
        arrList.add(52);
        arrList.add(123);
        arrList.add(25);

//        Print using get()
        System.out.println("Printing element using .get(index)");
        System.out.println(arrList.get(0));
        System.out.println(arrList.get(1));
        System.out.println(arrList.get(2));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

//        printing all the elements of the arraylist
        System.out.println("Printing all using for each");
        for (Integer element : arrList) {
            System.out.println(element);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

//      removing an element .remove(index)
        System.out.println("Removing an element index2 with value 123");
        arrList.remove(2);
        for (Integer element : arrList) {
            System.out.println(element);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

//      Size of a list using .size() method
        System.out.println("Printing using normal for and size() method");
        for (int i = 0; i < arrList.size(); i++) {
            Integer n = arrList.get(i);
            System.out.println("Index" + i + ": " + n);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

//        clear method
        System.out.println("clear all elements");
        arrList.clear();
        for (Integer element : arrList) {
            System.out.println(element);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

    }
}
