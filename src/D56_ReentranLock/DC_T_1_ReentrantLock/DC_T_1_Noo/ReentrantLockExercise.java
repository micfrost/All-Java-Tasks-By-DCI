package D56_ReentranLock.DC_T_1_ReentrantLock.DC_T_1_Noo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExercise {
    private int sharedResource = 0;
    private final ReentrantLock resourceLock = new ReentrantLock();
    public static void main(String[] args) {
        ReentrantLockExercise exercise = new ReentrantLockExercise();
        int numIncrementThreads = 3;
        int numDecrementThreads = 2;
        Thread[] threads = new Thread[numIncrementThreads +
                numDecrementThreads];
        //Two loops are used to create instances
        // of IncrementThread and DecrementThread classes and store them in the threads array.

        // Initialize and store increment threads
        for (int i = 0; i < numIncrementThreads; i++) {
            threads[i] = exercise.new IncrementThread();
        }

        // Initialize and store decrement threads

        for (int i = 0; i < numDecrementThreads; i++) {
            threads[numIncrementThreads + i] = exercise.new
                    DecrementThread();

        }

        // Start all threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final Shared Resource Value: " +
                exercise.sharedResource);
    }
    class IncrementThread extends Thread {
        @Override
        public void run() {

                resourceLock.lock();
                try {
                    System.out.println("incremeting threads");
                    sharedResource += 5;
                } finally {
                    resourceLock.unlock();

            }
        }
    }
    class DecrementThread extends Thread {
        @Override
        public void run() {

                resourceLock.lock();
                try {
                    System.out.println("decrementing threads");
                    sharedResource -= 3;
                } finally {
                    resourceLock.unlock();
            }
        }
    }
}