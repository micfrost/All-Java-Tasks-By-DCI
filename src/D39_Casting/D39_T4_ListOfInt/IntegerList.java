package D39_Casting.D39_T4_ListOfInt;

import java.util.ArrayList;

public class IntegerList {
    public static void main(String[] args) {
        System.out.println("List of Integers");
        System.out.println("DC_T_1_ReantrantLock_Inside program that works with a list of integers using both primitive and wrapper classes");
        System.out.println(" ");

//        Create an ArrayList of integers (use wrapper class Integer).
        ArrayList<Integer> integerArrayList = new ArrayList<>();

//        Add integers to the list using both primitive int values and Integer wrapper objects (autoboxing).
        Integer integer100 = 100;
        int int10= 10;
        integerArrayList.add(integer100);
        integerArrayList.add(int10);

//        Retrieve and display integers from the list using both primitive data types and wrapper classes (unboxing).
        Integer integer0 = integerArrayList.get(0);
        int int1 = integerArrayList.get(1);
        int no=1;
        for (Integer element: integerArrayList
             ) {
            System.out.println("No " + no + ": " + element);
            no++;
        }

//        Perform a mathematical operation (e.g., sum, product) on the integers from the list.
        int sum = integer0 + int1;
        System.out.println("Sum: " + sum);

    }
}
