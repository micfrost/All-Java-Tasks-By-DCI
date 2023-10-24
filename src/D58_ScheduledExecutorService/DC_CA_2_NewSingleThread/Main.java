package D58_ScheduledExecutorService.DC_CA_2_NewSingleThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

//        Only one Thread is enough to run two tasks or more.
        ScheduledExecutorService executorSeS = Executors.newSingleThreadScheduledExecutor();

        Runnable delayedTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Delayed task.");
            }
        };
        executorSeS.schedule(delayedTask, 1, TimeUnit.SECONDS);

        Runnable repeatedTask= new Runnable() {
            @Override
            public void run() {
                System.out.println("Repeated task.");
            }
        };
executorSeS.scheduleAtFixedRate(repeatedTask, 3, 3,TimeUnit.SECONDS);

//Sleeps makes the main thread to wait 12 sek and this gives time for other threads to execute.
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorSeS.shutdown();

        try {
            executorSeS.awaitTermination(1,TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
