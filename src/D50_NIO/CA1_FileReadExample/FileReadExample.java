package D50_NIO.CA1_FileReadExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileReadExample {

    public static void main(String[] args) throws FileNotFoundException {

        try {
//            to reach the file in order to read it
            FileInputStream fileInputStream = new FileInputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D50_NIO//exampleNIO.txt");

//            create a channel
            FileChannel channel = fileInputStream.getChannel();

//            create a buffer and set the capacity
            ByteBuffer buffer = ByteBuffer.allocate(1024);

//            this bytesRead variable will count the number of bytes read
            int bytesRead = channel.read(buffer);

            while (bytesRead != -1) {
//                Prepare the buffer for reading
                buffer.flip();
//                Process the data in the buffer
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
                bytesRead = channel.read(buffer);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
