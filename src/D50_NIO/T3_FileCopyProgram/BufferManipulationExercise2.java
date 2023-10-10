package D50_NIO.T3_FileCopyProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferManipulationExercise2 {

    public static void main(String[] args) {

        System.out.println("- - -");
        System.out.println("A program that reads data from a file into a ByteBuffer, and then copies that data from the ByteBuffer to another file using a different FileChannel. This exercise simulates file copying\n" +
                "This Java program reads data from a source file named \"source.txt\" and writes it to a destination file named \"destination.txt.\" It demonstrates file I/O using Java NIO and ByteBuffer.");
        System.out.println("- - -");

//           Copy a file from source.txt to destination.txt
        try {

//          A Path to the file in order to read it
            FileInputStream fileInputStream = new FileInputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D50_NIO//source.txt");
//          A Path to  the file in order to write it
            FileOutputStream fileOutputStream = new FileOutputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D50_NIO//destination.txt");

//            create a channels
            FileChannel sourceChannel = fileInputStream.getChannel();
            FileChannel destinationChannel = fileOutputStream.getChannel();

//            create a buffer and set the capacity
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Read data from the source file into the ByteBuffer and write it to the destination file

            while (sourceChannel.read(buffer) != -1) {
//              Switch to read mode
                buffer.flip();

//                to write into a destination.txt
                destinationChannel.write(buffer);

//                to print it in console
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();  // Switch mode
            }
            // Close the file channels
            sourceChannel.close();
            destinationChannel.close();
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("\n- - -");
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Oh no: " + e);
        }
    }
}
