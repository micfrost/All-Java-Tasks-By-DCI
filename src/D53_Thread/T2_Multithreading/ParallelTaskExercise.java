package D53_Thread.T2_Multithreading;

class ParallelTask extends Thread {
    private int number;
    public ParallelTask(int number) {
        this.number = number;
    }

    public void factorial() {
        String nameOfThread = "Current thread: " + Thread.currentThread().getName();

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println(nameOfThread + ". Factorial of " + number + " is: " + result);
    }

    public void run() {
        factorial();
    }
}


public class ParallelTaskExercise {
    public static void main(String[] args) {

        ParallelTask thread0 = new ParallelTask(2);
        ParallelTask thread1 = new ParallelTask(3);
        ParallelTask thread2 = new ParallelTask(4);

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

