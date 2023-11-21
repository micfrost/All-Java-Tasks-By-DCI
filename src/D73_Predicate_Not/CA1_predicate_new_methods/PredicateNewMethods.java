package D73_Predicate_Not.CA1_predicate_new_methods;

import java.util.List;
import java.util.function.Predicate;

import static java.util.function.Predicate.not;

public class PredicateNewMethods {


    public static void main(String[] args) {

        List<Integer>  numbers = List.of(1,4,6,7,39,60);
        Predicate<Integer> evenNumbers = number -> number%2==0;

        System.out.println("\n1. Negate()");
        numbers.stream().filter(evenNumbers.negate()).forEach(System.out::println);

        System.out.println("\n2. not(Predicate()");
        numbers.stream().filter(not(evenNumbers)).forEach(System.out::println);




        System.out.println("\n3. filter with a boolean");
        numbers.stream().filter(PredicateNewMethods::isEven).forEach(System.out::println);

        System.out.println("\n4. filter with a boolean and this is not()");
        numbers.stream().filter(not(PredicateNewMethods::isEven)).forEach(System.out::println);
    }
    public static boolean isEven(Integer number) {
        return number%2==0;
    }

}