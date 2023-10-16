package D53_Thread.T1_Threads;


import java.util.Random;

class SimpleThread extends Thread {

    @Override
    public void run() {

            Random random = new Random();
            int randomNumber = random.nextInt(10);
            System.out.println("Current thread: " + Thread.currentThread().getName() + ", Random number is: " + randomNumber);


    }
}

public class SimpleThreadExercise {


    public static void main(String[] args) throws InterruptedException {
        Thread thread0 = new SimpleThread();
        Thread thread1 = new SimpleThread();
        Thread thread2 = new SimpleThread();

        thread0.start();
        thread1.start();
        thread2.start();

//        The code continues after all threads are completed.
        try {
            thread0.join();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Oh no: " + e);
        }
        System.out.println();
        System.out.println("The code after all threads are completed.");
    }

}
