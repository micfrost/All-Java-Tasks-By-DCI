package D59_AtomicVariable.DC_T_2_AtomicIntegerExecutor.MJ;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class AtomicCountDown implements Runnable {
    Scanner scanner = new Scanner(System.in);
    AtomicInteger atomicTimer;
    boolean isEnd = false;
    int inputUser;

    public AtomicCountDown() {
        System.out.println("Enter start point: ");
        inputUser = Integer.parseInt(scanner.nextLine());
        atomicTimer = new AtomicInteger(inputUser);
    }

    @Override
    public void run() {

        if (atomicTimer.get() > 0) {
            atomicTimer.decrementAndGet();
            System.out.println("Time is running: " + atomicTimer.get());
        } else {
            if (!isEnd)
                System.out.println("Time is up.");
            isEnd = true;
        }
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException {

        AtomicCountDown atomicCountDown = new AtomicCountDown();

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(atomicCountDown, 1, 1, TimeUnit.SECONDS);

        Thread.sleep((atomicCountDown.inputUser+2)*1000);

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);

        System.out.println("- - - ");
        System.out.println("The program ended successfully.");
    }
}
