package D49_IO.CA1_FileOutputStream;

import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

        try {
//          In order to send a text out to a file
            FileOutputStream file = new FileOutputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//testStream1.txt");
            String text1 = "Java Course e01\n";
            String text2 = "Java Course e02\n";
            byte b1[] = text1.getBytes();
            byte b2[] = text2.getBytes();
            file.write(b1);
            file.write(b2);
            file.close();
            System.out.println("Yeah, Success! Output");


        } catch (Exception e) {
            System.out.println("Oh no: " + e);
        }

    }
}
