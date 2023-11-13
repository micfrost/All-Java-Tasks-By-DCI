package D67_Stream.DC_T_2_Stream_filter_mappig;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExercise {

    static void processData(List<Person> inputList, Predicate<Person> predicate) {

        System.out.println();
        System.out.println("Filtered List based on a specified condition: ");
        var filteredList = inputList
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);

        System.out.println();
        System.out.println("Map the filtered List : convert persons to their names: ");
        var mappedList = filteredList.stream().map(Person::getName);
        mappedList.forEach(element -> System.out.println(element + " "));
    }

    public static void main(String[] args) {

        var inputList = List.of(new Person("Tomasz", 50), new Person("Michal", 39), new Person("Stanislaw", 86));

        System.out.println();
        System.out.println("Original List: ");
        inputList.forEach(System.out::println);

        System.out.println();
        System.out.println("Condition: Age > 40");
        Predicate<Person> predicateAge = person -> person.getAge() > 40;

        processData(inputList, predicateAge);

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
