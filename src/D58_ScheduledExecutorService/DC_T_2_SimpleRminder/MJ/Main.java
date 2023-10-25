package D58_ScheduledExecutorService.DC_T_2_SimpleRminder.MJ;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        System.out.println("Enter the reminder message and the time delay for the reminder: ");
String inputMsg = scanner.nextLine();
        System.out.println("Set the time delay for the reminder [Seconds]: ");
int inputDelay = Integer.parseInt(scanner.nextLine());
        Runnable reminder = new Runnable() {
            @Override
            public void run() {
                System.out.println("Reminder Message: " + inputMsg);
            }
        };

        executorService.schedule(reminder, inputDelay, TimeUnit.SECONDS);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
