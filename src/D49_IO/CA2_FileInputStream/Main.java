package D49_IO.CA2_FileInputStream;

import java.io.FileInputStream;

public class Main {


    public static void main(String[] args) {

        try {
//            In order to read something what is written in a file

            FileInputStream file = new FileInputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//testStream1.txt");

            int n = 0;

            while ((n = file.read()) != -1) {
                System.out.print((char) n);
            }
            file.close();
            System.out.println();
            System.out.println("Yeah, Success! Input");
        } catch (Exception e) {
            System.out.println("Oh no: " + e);
        }
    }

}
