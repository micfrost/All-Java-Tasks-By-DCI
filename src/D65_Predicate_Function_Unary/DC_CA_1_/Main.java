package D65_Predicate_Function_Unary.DC_CA_1_;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

//        twierdzenie, orzeczenie, assert
//        Predicate test and returns true or false

        //Anonymous Class
        System.out.println("- - -");
        System.out.println("Old normal way with Anonymous Class: ");
        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String stringInput) {
                return stringInput.length() <5 ;
            }
        };
        System.out.println(predicate1.test("apple"));
        System.out.println(predicate1.test("pear"));

//      Lambda Expression
        System.out.println("- - -");
        System.out.println("Shorter with Lambda Expression: ");
        Predicate<String> p2 = inputString -> inputString.length() < 5;
        System.out.println(predicate1.test("apple"));
        System.out.println(predicate1.test("pear"));

    }


}
