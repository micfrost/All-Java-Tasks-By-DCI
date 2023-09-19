package D42_Date.D42_CA4_Zone;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        //      Time Zones
        System.out.println("- - -");
        System.out.println("Time Zones ");
        ZoneId zone1 = ZoneId.of("Europe/Paris");
        ZoneId zone2 = ZoneId.of("America/Chicago");
        LocalTime time8 = LocalTime.now(zone1);
        System.out.println("Europe/Paris: " + time8);
        time8 = LocalTime.now(zone2);
        System.out.println("America/Chicago: " + time8);

//      Get Zone Id
        System.out.println("- - -");
        System.out.println("Get Zone Id");
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone.getZone());


    }
}
