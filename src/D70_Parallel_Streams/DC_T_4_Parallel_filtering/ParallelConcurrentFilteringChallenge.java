package D70_Parallel_Streams.DC_T_4_Parallel_filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelConcurrentFilteringChallenge {

    private static List<String> filterAndCollectConcurrently(List<String> words, int lengthThreshold) {

        return words.parallelStream().filter(word -> word.length() <= lengthThreshold).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Julian", "Michal", "Ola", "Java", "Stream", "Challenge"));

        var output = filterAndCollectConcurrently(words, 5);

        System.out.println(words);
        System.out.println(output);
    }
}
