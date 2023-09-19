package D42_Date.D42_CA2_1_LocalTime;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

//      Getting the current time
        System.out.println("- - -");
        System.out.println("Getting the current time");
        LocalTime time = LocalTime.now();
        System.out.println(time);

//      Specifying our own time
        System.out.println("- - -");
        System.out.println("Specifying our own time");
        LocalTime time1 = LocalTime.of(11, 45, 00);
        System.out.println(time1);

//      Subtract hours and minutes
        System.out.println("- - -");
        System.out.println("Subtract hours and minutes");
        LocalTime time2 = LocalTime.of(10, 30, 00);
        System.out.println(time2);
        LocalTime time3 = time2.minusHours(1);
        LocalTime time4 = time3.minusMinutes(10);
        time4 = time4.minusSeconds(10);
        System.out.println(time4);

//      Add hours and minutes
        System.out.println("- - -");
        System.out.println("Add hours and minutes");
        LocalTime time5 = LocalTime.of(20, 40, 20);
        System.out.println(time5);
        LocalTime time6 = time5.plusHours(3);
        time6 = time6.plusMinutes(10);
        time6 = time6.plusSeconds(10);
        System.out.println(time6);



    }
}
