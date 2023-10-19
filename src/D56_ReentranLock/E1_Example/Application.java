package D56_ReentranLock.E1_Example;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    reentrantLockExample.thread1();
                } catch (InterruptedException e) {
               e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    reentrantLockExample.thread2();
                } catch (InterruptedException e) {
                    e.printStackTrace();                }

            }
        });

        thread1.start();
        thread2.start();


            thread1.join();
            thread2.join();

        reentrantLockExample.finished();
    }

}

