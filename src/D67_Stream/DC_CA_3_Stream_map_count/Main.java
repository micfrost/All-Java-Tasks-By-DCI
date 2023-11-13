package D67_Stream.DC_CA_3_Stream_map_count;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var colors = List.of("Red", "Blue", "Purple", "White", "Yellow", "Green", "Black");

//        1. converting the array to a stream
//        2. map in order to take input (a String from an array List) and give modified output (as an object of a custom class Color)
//        3. Printing


        System.out.println("\n- - -\n1. Using Lambda");
        colors
                .stream()
                .map(element -> new Color(element))
                .forEach(n -> System.out.println(n));


        System.out.println("\n- - -\n2. Using ::");
       colors
                .stream()
                .map(Color::new)
                .forEach(System.out::println);


        System.out.println("\n- - -\n3. count in order o count hte number of elements");
        long totalCount = colors
                .stream()
                .count();
        System.out.println("Number of the elements in the list: " + totalCount);
    }
}
