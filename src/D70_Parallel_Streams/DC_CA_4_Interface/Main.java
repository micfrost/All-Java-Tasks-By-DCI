package D70_Parallel_Streams.DC_CA_4_Interface;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sequential Stream");
        IntStream ordered = IntStream.rangeClosed(1,10);
        ordered.forEach(System.out::println);
        System.out.println("Is Parallel? :" + ordered.isParallel());

        System.out.println("Parallel Stream");
        IntStream orderedToUn = IntStream.rangeClosed(1,10);
        System.out.println("Is Parallel? :" + orderedToUn.isParallel());
        orderedToUn.parallel().forEach(System.out::println);
        System.out.println("Is Parallel? :" + orderedToUn.isParallel());


    }
}
