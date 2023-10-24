package D58_ScheduledExecutorService.DC_T_1_PreiodicReportGeneration.NO;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ReportGenerationExercise {
    public static void main(String[] args) {
        // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        // Task to generate reports
        Runnable reportGenerationTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Generating report at " +
                        System.currentTimeMillis());
            }
        };
        // Schedule the report generation task to run every 10 seconds
        executor.scheduleAtFixedRate(reportGenerationTask, 0, 10, TimeUnit.SECONDS);
        // Allow the program to run for a while (e.g., 60 seconds)
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Shutdown the executor service to stop scheduling new tasks
        executor.shutdown();
        // Ensure all previously scheduled tasks are completed
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
