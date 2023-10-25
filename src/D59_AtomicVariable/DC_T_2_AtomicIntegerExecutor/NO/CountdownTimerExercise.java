package D59_AtomicVariable.DC_T_2_AtomicIntegerExecutor.NO;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Scanner;
public class CountdownTimerExercise {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial countdown value (seconds): ");
        int initialCountdown = scanner.nextInt();

        ScheduledExecutorService executor =
                Executors.newSingleThreadScheduledExecutor();


        AtomicInteger countdown = new AtomicInteger(initialCountdown);


        Runnable countdownTask = new Runnable() {
            @Override
            public void run() {
                int remainingTime = countdown.decrementAndGet();
                if (remainingTime > 0) {
                    System.out.println("Countdown: " + remainingTime + " seconds");
                } else {
                    System.out.println("Time's up!");
                    executor.shutdown();
                }
            }
        };


        executor.scheduleAtFixedRate(countdownTask, 0, 1, TimeUnit.SECONDS);
    }
}
