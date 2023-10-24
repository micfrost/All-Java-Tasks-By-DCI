package D56_ReentranLock.DC_T_1_ReantrantLock_Inside;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExercise {
    private static int sharedResource = 0;
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        int numIncrementThreads = 3;
        int numDecrementThreads = 2;

        // Create arrays to hold thread instances
        IncrementThread[] incrementThreads = new IncrementThread[numIncrementThreads];
        DecrementThread[] decrementThreads = new DecrementThread[numDecrementThreads];

        // Create and start increment threads
        for (int i = 0; i < numIncrementThreads; i++) {
            incrementThreads[i] = new IncrementThread();
            incrementThreads[i].start();
        }

        // Create and start decrement threads
        for (int i = 0; i < numDecrementThreads; i++) {
            decrementThreads[i] = new DecrementThread();
            decrementThreads[i].start();
        }

        // Wait for all threads to finish
        for (IncrementThread thread : incrementThreads) {
            thread.join();
        }

        for (DecrementThread thread : decrementThreads) {
            thread.join();
        }

        // Print the final value of the shared resource
        System.out.println("Final value of the shared resource: " + sharedResource);
    }

    static class IncrementThread extends Thread {
        @Override
        public void run() {

                lock.lock();
                try {
                    sharedResource += 5;
                } finally {
                    lock.unlock();

            }
        }
    }

    static class DecrementThread extends Thread {
        @Override
        public void run() {

                lock.lock();
                try {
                    sharedResource -= 3;
                } finally {
                    lock.unlock();

            }
        }
    }
}
