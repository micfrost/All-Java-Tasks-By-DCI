package D70_Parallel_Streams.DC_T_2_Filtering_seq_vs_parallel.micro;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringChallenge {


    private static List<Integer> sequentialFilterExample(List<Integer> numbers){
        return numbers
                .stream()
                .filter(i -> (i % 2) == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> parallelFilterExample(List<Integer> numbers) {
        return numbers
                .parallelStream()
                .filter(i -> (i % 2) == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        var numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        System.out.println("\nSequential Stream");
        long startTime1 = System.currentTimeMillis();

        sequentialFilterExample(numbers);

        long endTime1 = System.currentTimeMillis();
        System.out.println("Time in milisekunds: " + (endTime1-startTime1) + ".");


        System.out.println("\nParallel Stream");
        long startTime2 = System.currentTimeMillis();

        parallelFilterExample(numbers);

        long endTime2 = System.currentTimeMillis();
        System.out.println("Time in milisekunds: " + (endTime2-startTime2) + ".");
    }
}
