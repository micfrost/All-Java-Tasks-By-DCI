package D31_Linked_AND_TreeSet.D31_CA_TreeSet;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        System.out.println("- - - - - - - -");
        System.out.println("TREESET WITH STRING: COLORS: ");


        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Yellow");
        colors.add("Gray");

        int serial = 1;
        for (String element : colors
        ) {
            System.out.print("Serial number: " + serial + ": ");
            System.out.println(element);
            serial++;
        }

        System.out.println("- - - - - - - -");
        System.out.println("TREESET WITH INTEGER; NUMBERS: ");

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(12);
        numbers.add(43);
        numbers.add(1);
        numbers.add(4);

        int serialOfNumbers = 1;
        for (Integer element : numbers) {
            System.out.print("Serial number: " + serialOfNumbers + ": ");
            System.out.println(element);
            serial++;
        }

        System.out.println("- - - - - - - -");
        System.out.println("TREESET WITH CUSTOM OBJECT; NUMBERS: ");

        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person("John", 43));
        people.add(new Person("Mary", 34));
        people.add(new Person("Bob", 52));
        people.add(new Person("Stella", 23));

        for (Person person: people) {
            System.out.println(person);
        }

    }
}

