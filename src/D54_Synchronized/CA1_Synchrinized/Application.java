package D54_Synchronized.CA1_Synchrinized;

public class Application {

    int number = 0;

    public void numberIncrementation() {
        number++;
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.multipleThreads();
    }

    public synchronized void multipleThreads() {

//        the third way to create Instance of Thread
        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int n = 0; n < 20000; n++)
                    numberIncrementation();
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int n = 0; n < 20000; n++)
                    numberIncrementation();
            }
        });

        //        Starting both together making stand problem
//       the best way is too use synchronized
        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Number is: " + number);
    }
}
