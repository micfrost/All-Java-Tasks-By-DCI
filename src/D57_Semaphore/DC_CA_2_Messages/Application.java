package D57_Semaphore.DC_CA_2_Messages;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {

//      creates the new Thread if it is going to be needed
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int n = 0; n < 300; n++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {

                   Messages.getValue().send();
                }
            });
        }
executorService.shutdown();

        try {
            executorService.awaitTermination(10, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
