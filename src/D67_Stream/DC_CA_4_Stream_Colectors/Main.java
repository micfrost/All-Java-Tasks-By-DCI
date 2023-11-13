package D67_Stream.DC_CA_4_Stream_Colectors;

import D67_Stream.DC_CA_3_Stream_map_count.Color;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n- - -\n1. Input: List<String>");
        var inputListString = List.of("Red", "Blue", "Purple", "White", "Yellow", "Green", "Black");
        inputListString.forEach(element -> System.out.println(element));

//        1. transform the L
//        ist<String> to a Stream<String>
//        2. changing a Stream<String> to a Stream<Color>
//        3. collectors.toList - collecting a stream to the List<Color>
        System.out.println("\n- - -\n2. Output: custom Class: List<Color> ");
        var outputListClassColor
                = inputListString
                .stream()
                .map(element -> new Color(element))
                .collect(Collectors.toList());

        System.out.println(outputListClassColor.get(0).getClass());
        outputListClassColor.forEach(element -> System.out.println(element));

        System.out.println("\n- - -\n3. Printing two lists.");
        System.out.println("List<String>");
        System.out.println(inputListString);
        System.out.println();
        System.out.println("List<Color>");
        System.out.println(outputListClassColor);
    }
}

