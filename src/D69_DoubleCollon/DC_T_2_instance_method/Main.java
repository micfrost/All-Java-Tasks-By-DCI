package D69_DoubleCollon.DC_T_2_instance_method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    static List<Person> filterAdults(List<Person> list, Predicate<Person> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Person> inputList = new ArrayList<>();
        inputList.add(new Person("Emmanuel", 34));
        inputList.add(new Person("Albert", 44));
        inputList.add(new Person("Maria", 32));

        Predicate<Person> predicateAdult = Person::isAdult;
        var filteredList = filterAdults(inputList, predicateAdult);

        filteredList.forEach(p -> System.out.println(p.getName() + " is an adult."));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    boolean isAdult() {
        return age >= 18;
    }

    public String getName() {
        return name;
    }
}