package D69_DoubleCollon.DC_CA_3_Constructor_referance;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public Person(String s) {
        System.out.println("Hello " + s);
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Emmanuel");
        list.add("Albert");
        list.add("Maria");

list.forEach(Person::new);

    }
}
