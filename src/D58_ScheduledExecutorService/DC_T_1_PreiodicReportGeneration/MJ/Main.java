package D58_ScheduledExecutorService.DC_T_1_PreiodicReportGeneration.MJ;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService executorSES = Executors.newSingleThreadScheduledExecutor();

        // Task to generate reports
        Runnable periodicReport = new Runnable() {
            @Override
            public void run() {
                Date currentDate = new Date();

                System.out.println("Generating report ... " + "Current Timestamp: " + currentDate.getTime() + " milliseconds");
            }
        };
        // Schedule the report generation task to run every 5 seconds
        executorSES.scheduleAtFixedRate(periodicReport, 2,5, TimeUnit.SECONDS);

        // Allow the program to run for a while (e.g., 50 seconds)
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Shutdown the executor service to stop scheduling new tasks
        executorSES.shutdown();
        // Ensure all previously scheduled tasks are completed
        try {
            executorSES.awaitTermination(5, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
