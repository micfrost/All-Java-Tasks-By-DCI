package D49_IO.T3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TextFileReader {

    public static void writeStudentRecordsToFile(String[][] studentRecords, String fileName) throws IOException {
        FileOutputStream fileWithOutputNames = null;
        try {
            fileWithOutputNames = new FileOutputStream(fileName);
            for (String[] record : studentRecords) {
                for (int i = 0; i < record.length; i++) {
                    fileWithOutputNames.write(record[i].getBytes());
                    if (i != (record.length - 1)) {
                        fileWithOutputNames.write(',');
                    }
                }
                fileWithOutputNames.write('\n');
            }
            System.out.println("Yeah, Success! Writing a file with names successfully");
        } finally {
            if (fileWithOutputNames != null) {
                fileWithOutputNames.close();
            }
        }
    }

    public static void readAndDisplayFile(String pathToFileToBeRead) throws IOException {
        FileInputStream file = null;
        try {
            System.out.println("Reading a file and printing the inside: ");
            file = new FileInputStream(pathToFileToBeRead);
            int n = 0;
            while ((n = file.read()) != -1) {
                System.out.print((char) n);
            }
            file.close();
        } finally {
            if (file != null) {
                file.close();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("- - -");
        System.out.println("Reading and Displaying Text from a File using FileInputStream");
        System.out.println("A program that reads text from a text file using only FileInputStream and displays it on the console.");
        System.out.println("- - -");

        String[][] studentRecords = {{"ID", "Name", "GPA"}, {"001", "John Kowalsky", "3.4"}, {"002", "Tadeusch Organitz", "4.5"}};
        String PathForFileForStudentRecords = "//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//student_records.csv";

//        writing a file
        try {
            writeStudentRecordsToFile(studentRecords, PathForFileForStudentRecords);
//      reading a file
            readAndDisplayFile(PathForFileForStudentRecords);
            System.out.println("- - -");
        } catch (IOException e) {
            System.out.println("Oh no: " + e);
        }
    }
}
