package D58_ScheduledExecutorService.DC_T_1_PreiodicReportGeneration.MJ;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ScheduledExecutorService executorSES = Executors.newSingleThreadScheduledExecutor();

        Runnable periodicRaport = new Runnable() {
            @Override
            public void run() {
                Date currentDate = new Date();

                System.out.println("Generating report ... " + "Current Timestamp: " + currentDate.getTime() + " milliseconds");
            }
        };

        executorSES.scheduleAtFixedRate(periodicRaport, 2,5, TimeUnit.SECONDS);

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorSES.shutdown();

        try {
            executorSES.awaitTermination(5, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
