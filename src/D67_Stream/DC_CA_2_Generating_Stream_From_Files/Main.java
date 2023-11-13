package D67_Stream.DC_CA_2_Generating_Stream_From_Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException {

        String path = "src//D67_Stream//DC_CA_2_Generating_Stream_From_Files//text.txt";
        Files.lines(Paths.get(path)).forEach(System.out::println);

    }


}
