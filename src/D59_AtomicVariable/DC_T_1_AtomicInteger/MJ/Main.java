package D59_AtomicVariable.DC_T_1_AtomicInteger.MJ;

import java.util.concurrent.atomic.AtomicInteger;

class Counter extends Thread {
    AtomicInteger count;

    Counter() {
        count = new AtomicInteger(0);
    }

    void plus() {
        count.incrementAndGet();

    }

    void minus() {
        count.decrementAndGet();

    }

    @Override
    public void run() {
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.plus();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.minus();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.plus();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Final result: " + counter.count);
    }
}
