package D70_Parallel_Streams.DC_T_1_Seq_vs_Parallel.micfro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NameTransformation {

    private static List<String> sequentialStreamExample(List<String> names) {
        return names.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    private static List<String> parallelStreamExample(List<String> names) {
        return names.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        var names = new ArrayList<>(List.of("Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola","Julian","Michal", "Ola"));

        System.out.println("\nSequential Stream");
        long startTime1 = System.currentTimeMillis();

        sequentialStreamExample(names);

        long endTime1 = System.currentTimeMillis();
        System.out.println("Time in milisekunds: " + (endTime1-startTime1) + ".");


        System.out.println("\nParallel Stream");
        long startTime2 = System.currentTimeMillis();

        parallelStreamExample(names);

        long endTime2 = System.currentTimeMillis();
        System.out.println("Time in milisekunds: " + (endTime2-startTime2) + ".");
    }
}
