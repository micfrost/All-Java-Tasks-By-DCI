package D67_Stream.DC_T_4_Stream_Filter_Transform.micfro;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExercise {

    static void filterAndTransform(List<Person> imputList, Predicate<Person> predicateCondition, Function<Person, String> functionTransform) {

        System.out.println();
        System.out.println("Filtered List: ");
        var filterdList = imputList.stream().filter(predicateCondition).collect(Collectors.toList());
        filterdList.forEach(System.out::println);

        System.out.println();
        System.out.println("Tranformed List: ");
        var transformedList = filterdList.stream().map(functionTransform);
        transformedList.forEach(System.out::println);
    }


    public static void main(String[] args) {

        var inputList = List.of(new Person("Tomasz", 50), new Person("Michal", 39), new Person("Julian", 1));

        System.out.println();
        System.out.println("Original List: ");
        inputList.forEach(System.out::println);

        Predicate<Person> predicateAge = person -> person.getAge() >18;
        Function<Person, String> functionToString = person -> person.getName();

        filterAndTransform(inputList, predicateAge, functionToString);
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name: " + name +
                ", age:" + age;
    }
}
