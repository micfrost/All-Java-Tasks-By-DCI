package D63_Functional_Programming.DC_T_1_LambdaExercise;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

    static List<String> filterAndTransform(List<Person> inputList) {

        List<String> outputList = new ArrayList<>();

        inputList.forEach(person -> {
            if (person.getAge() <= 30) {
                outputList.add(person.getName() + ", " + person.getAge() + ", " + person.getCity());
            }
        });
        return outputList;
    }


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John Smith", 34, "New York"));
        personList.add(new Person("Timon Goldes", 54, "Chicago"));
        personList.add(new Person("Tris Waterson", 28, "Los Angeles"));

        System.out.println("- - -");
        System.out.println("Input:");
        personList.forEach(System.out::println);


        System.out.println("- - -");
        System.out.println("Output:");
        filterAndTransform(personList).forEach(System.out::println);
    }
}
