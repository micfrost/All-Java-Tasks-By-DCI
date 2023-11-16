package D70_Parallel_Streams.DC_CA_1_parallel_from_Stream_Class;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        // File path
        String pathname = "src/D70_Parallel_Streams/names.txt";

        // Creating a File object with the file path
        File file1 = new File(pathname);

        // Getting a stream of lines from the file using Files.lines() method
        Stream<String> text = Files.lines(file1.toPath());

        // Processing the lines in parallel using parallel() method and printing them
        text
                .parallel()
                .forEach(System.out::println);

        // Closing the stream after usage
        text.close();
    }
}