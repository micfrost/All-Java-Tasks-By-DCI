package D42_Date.D42_CA3_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentDataTime = LocalDateTime.now();
        System.out.println("Before formatting: " + currentDataTime);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("After formatting: " + LocalDateTime.now().format(formatter1));

        System.out.println("After formatting: " + LocalDateTime.now().format(formatter2));
        System.out.println("After formatting: " + LocalDateTime.now().format(formatter3));


    }
}
