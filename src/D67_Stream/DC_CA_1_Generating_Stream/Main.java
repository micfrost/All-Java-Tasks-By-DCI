package D67_Stream.DC_CA_1_Generating_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

//    Streams are a continuous flow of data.

    public static void main(String[] args) {

        System.out.println("- - -");
        System.out.println("Streaming the array List");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 5, 7, 9, 10));

        numbers.forEach(System.out::print);
        System.out.println();

        numbers.stream().forEach(System.out::print);
        System.out.println();

        numbers.stream().forEach(n -> {
            System.out.print(n + " ");
        });
        System.out.println();

        System.out.println("\n- - -\nGenerating streams");

        System.out.println("\n1. Using Stream.of");
        Stream.of(4, 8, 9, 12, 42, 50).forEach(System.out::print);

        System.out.println("\n\n2. Using Stream.generate");
        Stream.generate(() -> "Hello").limit(5).forEach(n -> System.out.print(n + " "));

        System.out.println("\n\n3.Using List of");
        List.of(4, 8, 9, 12, 42, 50).stream().forEach(System.out::print);

        System.out.println("\n\nEnd of a program.");
    }




}
