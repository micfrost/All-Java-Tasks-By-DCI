package D70_Parallel_Streams.DC_T_3_Parallel_String_length.miccfro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleParallelStreamChallenge {

    private static List<Integer> parallelStringLengths(List<String> words) {

        return words
                .parallelStream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Julian", "Michal", "Ola", "Java", "Stream", "Challenge"));

        var output = parallelStringLengths(words);

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i) + ", length: " + output.get(i) + ".");
        }

        System.out.println();
        int sum = 0;
        for (int i : output) {
            sum += i;
        }
        System.out.println("The length of all words together is: " + sum);
    }
}