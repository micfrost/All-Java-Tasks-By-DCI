package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.CH;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final int COUPLE_EATING_TIME_MS = 6000;
    private static final int TABLE_PREPARATION_TIME_MS = 3000;
    private static final int COUPLE_ARRIVAL_INTERVAL_MS = 2000;

    private final ReentrantLock taskLock = new ReentrantLock();
    private final Condition taskCompleted = taskLock.newCondition();
    private Semaphore tableForTwo = new Semaphore(1);  // Change to support multiple tables

    public static void main(String[] args) {
        Main restaurant = new Main();

        Thread tablePreparation = new Thread(restaurant.new TablePreparation());
        tablePreparation.start();

        while (true) {
            try {
                Thread.sleep(COUPLE_ARRIVAL_INTERVAL_MS);
                Thread customerCouple = new Thread(restaurant.new CustomerCouple());
                customerCouple.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class CustomerCouple extends Thread {
        @Override
        public void run() {
            try {
                tableForTwo.acquire();
                System.out.println("A Couple has taken a seat and they are eating. It is going take them " + COUPLE_EATING_TIME_MS / 1000 + " seconds.");
                Thread.sleep(COUPLE_EATING_TIME_MS);
                System.out.println("A Couple has finished eating and they are leaving. Thank you and Bye Bye.");
                taskLock.lock();
                taskCompleted.signal();
                taskLock.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class TablePreparation extends Thread {
        @Override
        public void run() {
            while (true) {
                taskLock.lock();
                System.out.println("Table for a couple is being prepared, wait " + TABLE_PREPARATION_TIME_MS / 1000 + " seconds.");
                try {
                    Thread.sleep(TABLE_PREPARATION_TIME_MS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Table for a couple is ready to be taken.");
                tableForTwo.release();
                try {
                    taskCompleted.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                taskLock.unlock();
            }
        }
    }
}
