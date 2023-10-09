package D49_IO.CA3_sequenceInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Main {

//    it is used here throws Exception only to show that it works
//    But the convention is to use try and catch (not the throws)

    public static void main(String[] args) throws Exception {

        FileInputStream file1 = new FileInputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//testStream1.txt");
        FileInputStream file2 = new FileInputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//testStream2.txt");
        FileOutputStream file3 = new FileOutputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//testStream3.txt");
        SequenceInputStream sis = new SequenceInputStream(file1, file2);

        int n = 0;

        while ((n = sis.read()) != -1) {
            file3.write(n);
            System.out.print((char) n);
        }

        sis.close();
        file1.close();
        file2.close();
        file3.close();
        System.out.println();
        System.out.println("Yeah, Success! sis");

    }
}
