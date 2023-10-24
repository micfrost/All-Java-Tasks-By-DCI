package D49_IO.T2;

import java.io.FileOutputStream;
import java.io.IOException;

public class CSVFileWriter {


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


    public static void main(String[] args) {

        System.out.println("- - -");
        System.out.println("Writing Data to a CSV File using FileOutputStream");
        System.out.println("DC_T_1_ReantrantLock_Inside Java program that writes data to a CSV file using the FileOutputStream class. You should write a list of student records to a CSV file.");
        System.out.println("- - -");

        String[][] studentRecords = {{"ID", "Name", "GPA"},{"001", "John Kowalsky", "3.4"}, {"002", "Tadeusch Organitz", "4.5"}};
        String PathForFileForStudentRecords = "//home//dci-student//IdeaProjects//JavaFbw//src//D49_IO//student_records.csv";

        try {

            writeStudentRecordsToFile(studentRecords, PathForFileForStudentRecords);

        } catch (IOException e) {
            System.out.println("Oh no: " + e);
        }

    }
}
