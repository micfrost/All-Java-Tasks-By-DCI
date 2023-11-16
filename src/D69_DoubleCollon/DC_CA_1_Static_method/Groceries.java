package D69_DoubleCollon.DC_CA_1_Static_method;

import java.util.ArrayList;
import java.util.List;

public class Groceries {

    static void items(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Apples");
        list.add("Milk");
        list.add("Rice");


        System.out.println("- - -");
        System.out.println("System.out::println.");
        list.forEach(System.out::println);

        System.out.println("- - -");
        System.out.println("1. Using as a static method.");
        System.out.println("Groceries::items");
        System.out.println("This is the same System.out::println.");
        list.forEach(Groceries::items);



    }
}
