package D70_Parallel_Streams.DC_CA_3_Sequential_vs_Parallel_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Using a normal (sequential) stream with a manually constructed list
        System.out.println("Normal (Sequential) Stream1");
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("4");
        list1.add("5");
        list1.stream().forEach(System.out::println);

        // Using a parallel stream with an ArrayList initialized using Arrays.asList()
        System.out.println("Parallel Stream2");
        List<String> list2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        list2.parallelStream().forEach(System.out::println);

        // Using a parallel stream with an immutable list created using List.of()
        System.out.println("Parallel Stream3 ---immutable list");
        List<String> list3 = List.of("1", "2", "3", "4", "5");
        list3.parallelStream().forEach(System.out::println);

        System.out.println("Parallel Stream4 - Mutable List");
        // Creating a mutable list from the immutable list
        List<String> list4 = new ArrayList<>(List.of("1", "2", "3", "4", "5"));
        list4.parallelStream().forEach(System.out::println);
    }
}


