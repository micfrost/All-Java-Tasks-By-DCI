package D56_ReentranLock.E1_Example;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private int value = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private void increaseValue() {
        for (int n = 0; n < 20000; n++) {
            value++;
        }
    }

    public void thread1() throws InterruptedException {
//        no other process can continue beside this one below.
        lock.lock();

        System.out.println("Waiting . . . ");
        condition.await();

//        and after something else is done it is come back here
        System.out.println("Another thread woke me up.");

        try {
            increaseValue();
        } finally {
            lock.unlock();
        }
//        thanks to unlock other threads can work.
//        finally secure that unlock will be always executed
    }

    public void thread2() throws InterruptedException {
//        no other process can continue beside this one below.

//        this ensure that the threat1 start firstly.
        Thread.sleep(1000);
        lock.lock();
//        jumped from await to the signal. and the whole block start executing

        condition.signal();
        System.out.println("Press enter to continue");
        new Scanner(System.in).nextLine();
        System.out.println("You pressed enter key!");




        try {
            increaseValue();
        } finally {
            lock.unlock();
        }
//        thanks to unlock other threads can work.
//        finally secure that unlock will be always executed
    }
    public void finished() {
        System.out.println("Final value is: " + value);
    }
}
