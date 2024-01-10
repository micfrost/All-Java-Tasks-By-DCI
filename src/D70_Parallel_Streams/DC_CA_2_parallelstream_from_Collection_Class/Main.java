package D70_Parallel_Streams.DC_CA_2_parallelstream_from_Collection_Class;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // File path
        String pathname = "D78_JDBC/src/D70_Parallel_Streams/names.txt";

        // Creating a File object with the file path
        File file2 = new File(pathname);

        // Getting a stream of lines from the file using Files.lines() method
        List<String> text = Files.readAllLines(file2.toPath());

        // Processing the lines in parallel using parallel() method and printing them
        text
                .parallelStream()
                .forEach(System.out::println);


    }
}