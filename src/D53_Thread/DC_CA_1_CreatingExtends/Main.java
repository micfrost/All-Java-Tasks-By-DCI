package D53_Thread.DC_CA_1_CreatingExtends;


class ThreadExample extends Thread {

    @Override
    public void run() {

        for(int n=1; n<3; n++) {
            try {
                Thread.sleep(1000);
                System.out.println("Current thread: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("Oh no: " + e);
            }

            System.out.println(n);
        }

    }
}

public class Main {

    public static void main(String[] args) {

        ThreadExample thread0 = new ThreadExample();
        ThreadExample thread1 = new ThreadExample();
        ThreadExample thread2 = new ThreadExample();

        thread0.start();

        try {
            System.out.println("Waiting in a main thread.....");
            thread0.join();
        } catch (Exception e) {
            System.out.println("Oh no: " + e);
        }

        thread1.start();

        try {
            System.out.println("Waiting in a main thread.....");
            thread1.join();
        } catch (Exception e) {
            System.out.println("Oh no: " + e);
        }

        thread2.start();

        try {
            System.out.println("Waiting in a main thread.....");
            thread2.join();
        } catch (Exception e) {
            System.out.println("Oh no: " + e);
        }

    }
}
