package D59_AtomicVariable.DC_CA_1_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

class Counter extends Thread {
     AtomicInteger count;

     Counter(){
        count=new AtomicInteger();
    }

    @Override
    public void run() {

        for (int n = 0; n < 30000; n++) {
//            count++    This doesnt work
            count.addAndGet(1);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
//        thread1 it is an name of an address
//        Thread1 is a variable name like John Smith by a Person.
        Thread thread1 = new Thread(counter, "Thread1");
        Thread thread2 = new Thread(counter, "Thread2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.count);

    }
}
