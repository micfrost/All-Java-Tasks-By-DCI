package D49_IO.T1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterExercise {


    public static void writeNamesToFile(String[] arrayOfNames, String fileName) {
        try {
            FileOutputStream fileWithOutputNames = new FileOutputStream(fileName);
            for (String element : arrayOfNames) {
                fileWithOutputNames.write(element.getBytes());
                fileWithOutputNames.write('\n');
            }
            System.out.println("Yeah, Success! Writing a file with names successfully");
            fileWithOutputNames.close();
        } catch (IOException e) {
            System.out.println("Oh no: " + e);
        }
    }

    public static void readNamesToProgram(String pathToFileToBeRead) {
        try {
            System.out.println("Reading a file and printing the inside: ");
            FileInputStream file = new FileInputStream(pathToFileToBeRead);
            int n = 0;
            while ((n = file.read()) != -1) {
                System.out.print((char) n);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Oh no: " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("- - -");
        System.out.println("Writing Data to a File using FileOutputStream");
        System.out.println("A Java program that demonstrates how to write data to a file using the FileOutputStream class.");
        System.out.println("- - -");

//        Writing a file
//        Output with names to the file
        String[] arrayNamesNicole = {"Nicole", "Casie", "Charlie", "David", "Raven"};
        String pathForFileNicole = "//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//nicoleEtc.txt";
        writeNamesToFile(arrayNamesNicole, pathForFileNicole);
        System.out.println("- - -");

//        reading a file
//        Input from this file to the program.
        readNamesToProgram(pathForFileNicole);
        System.out.println("- - -");
    }
}
