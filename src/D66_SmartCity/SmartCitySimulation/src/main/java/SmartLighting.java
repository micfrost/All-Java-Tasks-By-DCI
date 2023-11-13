package D66_SmartCity.SmartCitySimulation.src.main.java;

import java.time.LocalTime;

public class SmartLighting implements Runnable {
    public void run() {
        while (true) {
            // Get the current time
            LocalTime currentTime = LocalTime.now();

            // Adjust brightness based on time of day
            if (currentTime.isAfter(LocalTime.of(18, 0)) || currentTime.isBefore(LocalTime.of(6, 0))) {
                // Nighttime, increase brightness
                adjustBrightness(true);
            } else {
                // Daytime, decrease brightness
                adjustBrightness(false);
            }

            // Simulate monitoring at intervals (for example, every 30 seconds)
            try {
                Thread.sleep(30000); // Sleep for 30 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void adjustBrightness(boolean isNight) {
        // Logic to adjust street light brightness based on the time of day
        if (isNight) {
            System.out.println("Street lights set to higher brightness for the night.");
            // Adjust street lights to higher brightness
        } else {
            System.out.println("Street lights set to lower brightness for the day.");
            // Adjust street lights to lower brightness
        }
    }
}