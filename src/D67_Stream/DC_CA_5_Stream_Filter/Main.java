package D67_Stream.DC_CA_5_Stream_Filter;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input List:");
        var iputList = List.of(3, 5, 7, 8, 12, 15, 25, 28);

        iputList.forEach(System.out::println);
        System.out.println();

        var outputList = iputList
                .stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("Output List:");
        outputList.forEach(System.out::println);
    }
}
