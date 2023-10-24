package D58_ScheduledExecutorService.DC_CA_1_ScheduledExe;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {

        ScheduledExecutorService executorSES = Executors.newScheduledThreadPool(2);

        Runnable repeatedTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Beep");
            }
        };
        Runnable singleTask = new Runnable() {

            @Override
            public void run() {
                System.out.println("One-time task");
            }
        };
//Schedule repeatedTask to run every  2 seconds, with 5 seconds delay
        executorSES.scheduleAtFixedRate(repeatedTask,5,2, TimeUnit.SECONDS);
        executorSES.schedule(singleTask,10, TimeUnit.SECONDS  );


//        we are putting a main thread to sleep. to have time for other threads to be executed.
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorSES.shutdown();
        try {
            executorSES.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of Program");
    }
}
