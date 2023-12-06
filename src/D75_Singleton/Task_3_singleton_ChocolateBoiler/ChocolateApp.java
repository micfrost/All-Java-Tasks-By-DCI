package D75_Singleton.Task_3_singleton_ChocolateBoiler;
import static java.lang.Thread.currentThread;
class ChocolateBoiler {
    // Step 1
    private static ChocolateBoiler zoo;
    // Step 2
    private ChocolateBoiler() {
        System.out.println("Instance created");
    }
    // Step 3
    //    double-checked locking principle to make it thread-safe.
    public static ChocolateBoiler getInstance() {
        if (zoo == null) {
            synchronized (ChocolateBoiler.class) {
                if (zoo == null) zoo = new ChocolateBoiler();
            }
        }
        return zoo;
    }
    void filling() {
        System.out.println(currentThread().getName() + "\tfilling");
    }
    void boiling() {
        System.out.println(currentThread().getName() + "\tboiling");
    }
    void draining() {
        System.out.println(currentThread().getName() + "\tdraining");
    }
}
public class ChocolateApp {
    public static void main(String[] args) {

        Thread Choco1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ChocolateBoiler choco1 = ChocolateBoiler.getInstance();
                choco1.filling();choco1.boiling();choco1.draining();
            }
        }, "First ChocolateBoiler is: ");
        Thread Choco2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ChocolateBoiler choco2 = ChocolateBoiler.getInstance();
                choco2.filling();choco2.boiling();choco2.draining();
            }
        }, "Second ChocolateBoiler is: ");

        Thread Choco3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ChocolateBoiler choco3 = ChocolateBoiler.getInstance();
                choco3.filling();choco3.boiling();choco3.draining();
            }
        }, "Third ChocolateBoiler is: ");

        Choco1.start();Choco2.start();Choco3.start();
        try {
            Choco1.join();Choco2.join();Choco3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("- - -");
        System.out.println("Chocolate has been eaten successfully.");
    }
}
