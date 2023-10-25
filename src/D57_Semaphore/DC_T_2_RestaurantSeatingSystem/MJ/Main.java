package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.MJ;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class Main {
     Semaphore tableSemathor = new Semaphore(1);
     List<String> printJobs = new ArrayList<>();

     final ReentrantLock taskLock = new ReentrantLock();

     final Condition taskCompleted = taskLock.newCondition();

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

        Main.TableForTwo tableForTwo = seating.new TableForTwo();
        tableForTwo.start();



    }

    class ClientCouple extends Thread {
        @Override
        public void run() {
            taskLock.lock();

            try {
                tableSemathor.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("A Couple has taken a seat and they are eating. It is going take them 6sek.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A Couple  has finished eating and they are leaving. Thank you and Bye Bye.");

//            it is a time to clean a table
            try {
                taskCompleted.await(); //this jump to signal
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tableSemathor.release();
            taskLock.unlock();

        }
    }

    class TableForTwo extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            taskLock.lock();
            taskCompleted.signal();

            System.out.println(" - - - Table for a couple is being prepared, wait 4 sek.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" - - - Table for a couple  people is ready to be taken");

            tableSemathor.release();
            taskLock.unlock();


        }
    }

}
