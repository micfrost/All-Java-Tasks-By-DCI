package D50_NIO.T2_BufferBasic;

import java.nio.ByteBuffer;

//        Create a class named BufferBasicsExercise1
public class BufferBasicsExercise {

    //                In the main method, the following steps are performed:
    public static void main(String[] args) {

        //        Create a String variable named message with some textual data.
        String message = "01234567890123456789";

//        Create a ByteBuffer named buffer with a capacity of 1024 bytes using ByteBuffer.allocate(1024);.
        ByteBuffer buffer = ByteBuffer.allocate(message.length());

//        Convert the message string into bytes and store them in the buffer using buffer.put(message.getBytes());.
//        This effectively writes the string into the buffer.
        buffer.put(message.getBytes());

//        Call buffer.flip(); to switch the buffer from write mode to read mode. In read mode, you can read the data previously written into the buffer.
        buffer.flip();

//                Use a while loop with buffer.hasRemaining() to check
//                if there are any remaining bytes in the buffer to read.
        int no = 0;
        while (buffer.hasRemaining()) {

            //        Inside the loop, use buffer.get() to retrieve a byte from the
            //        buffer and cast it to a char to print it as a character.
            System.out.print(no + ": " );
            System.out.println((char) buffer.get());

            no++;
        }
        buffer.clear();

//                The loop continues until there are no more remaining bytes in the buffer.

    }

}
