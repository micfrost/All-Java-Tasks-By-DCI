package D65_Predicate_Function_Unary.DC_CA_2_Filtering_Predicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var valuesList = new ArrayList<>(List.of(3, 5, 6, 8, 20));
        valuesList.add(2);

        System.out.println("- - -");
        System.out.println("Input List");
        valuesList.forEach(System.out::println);

        System.out.println("- - -");
        System.out.println("Output List");
        valuesList.removeIf(element -> element <6 );
        valuesList.forEach(System.out::println);
    }
}
