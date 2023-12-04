package D75_Singleton.Task_2_singleton_multithread;

class ZooSingletonExample {
    // Step 1
    private static ZooSingletonExample zoo;

    // Step 2
    private ZooSingletonExample() {
        System.out.println("Instance created");
    }

    // Step 3
    //    double-checked locking principle to make it thread-safe.
    public static ZooSingletonExample getInstance() {
        if (zoo == null) {
            synchronized (ZooSingletonExample.class) {
                if (zoo == null) zoo = new ZooSingletonExample();
            }
        }
        return zoo;
    }

    void displayMessage(String message) {
        System.out.println(message);
    }
}

public class SingletonClient {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ZooSingletonExample zoo1 = ZooSingletonExample.getInstance();
                zoo1.displayMessage("Woooaaahh from zoo1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ZooSingletonExample zoo2 = ZooSingletonExample.getInstance();
                zoo2.displayMessage("Woooaaahh from zoo2");
            }
        });

        thread1.start();
        thread2.start();

    }
}
