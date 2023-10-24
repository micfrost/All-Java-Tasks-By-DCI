package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.MJ;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class Main {
    private Semaphore tableSemathor = new Semaphore(0);
    private List<String> printJobs = new ArrayList<>();

    private final ReentrantLock taskLock = new ReentrantLock();

    private final Condition taskCompleted = taskLock.newCondition();

    public static void main(String[] args) {

        Main seating = new Main();

        ClientCouple ClientCouple1 = seating.new ClientCouple();
        ClientCouple1.start();
        ClientCouple ClientCouple2 = seating.new ClientCouple();
        ClientCouple2.start();
        ClientCouple ClientCouple3 = seating.new ClientCouple();
        ClientCouple3.start();
        ClientCouple ClientCouple4 = seating.new ClientCouple();
        ClientCouple4.start();

        TableForTwo tableForTwo1 = seating.new TableForTwo();
        tableForTwo1.start();

    }

    class ClientCouple extends Thread {
        @Override
        public void run() {

            try {

                tableSemathor.acquire();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("A Couple has taken a seat and they are eating. It is going take them 6sek.");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A Couple  has finished eating and they are leaving. Thank you and Bye Bye.");


//I want to jump to clean a table for a next couple
            taskLock.lock();
            try {
                taskCompleted.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            taskLock.unlock();

        }
    }

    class TableForTwo extends Thread {

        @Override
        public void run() {

            taskLock.lock();
            taskCompleted.signal();
            System.out.println(" - - - Table for a couple is being prepared, wait 4 sek.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" - - - Table for a couple  people is ready to be taken");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            tableSemathor.release();
            taskLock.unlock();
        }
    }

}
