package D56_ReentranLock.DC_T_1_ReentrantLock_Outside;

import java.util.concurrent.locks.ReentrantLock;


public class ReentrantLockExercise {


    public static void main(String[] args) {

        System.out.println("- - -");
        System.out.println("ReentrantLock");
        System.out.println("Working with reentrant locks to synchronize access to a shared resource. Usage of the ReentrantLock class to implement an example of thread synchronization.");
        System.out.println("- - -");

        SharedValues sharedValues = new SharedValues();
        ReentrantLock reentrantLock = new ReentrantLock();

        IncrementThread incrementThread1 = new IncrementThread(sharedValues, reentrantLock);
        IncrementThread incrementThread2 = new IncrementThread(sharedValues, reentrantLock);
        DecrementThread decrementThread1 = new DecrementThread(sharedValues, reentrantLock);
        DecrementThread decrementThread2 = new DecrementThread(sharedValues, reentrantLock);

        incrementThread1.start();
        incrementThread2.start();
        decrementThread1.start();
        decrementThread2.start();

        try {
            incrementThread1.join();
            incrementThread2.join();
            decrementThread1.join();
            decrementThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final value of the shared resource: " + sharedValues.getCounter());


    }

}
