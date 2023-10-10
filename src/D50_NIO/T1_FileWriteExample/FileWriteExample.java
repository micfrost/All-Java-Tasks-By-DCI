package D50_NIO.T1_FileWriteExample;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class FileWriteExample {
    public static void main(String[] args) throws IOException {

        try {

            //create fileoutputstream object and pass the file path

            FileOutputStream fileOutputStream = new FileOutputStream("//home//dci-student//IdeaProjects//JavaFbw//src//D50_NIO//exampleNIO.txt");

            //create the channel object
            FileChannel channel = fileOutputStream.getChannel();

            // create a string variable which hold some text
            String poem = "There is a fresh air and we breathe deep.";

            //create a buffer and allocate some memory
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //insert data using buffer.put()
            buffer.put(poem.getBytes());

            //use flip method to prepare to write
            buffer.flip();

            // Write the data from buffer to channel
            channel.write(buffer);

//            close the output stream
            buffer.clear();

            fileOutputStream.close();

        } catch (Exception e) {
            System.out.println("Oh no: " + e);
        }

        //use try catch block whenever its necessary
    }
}
