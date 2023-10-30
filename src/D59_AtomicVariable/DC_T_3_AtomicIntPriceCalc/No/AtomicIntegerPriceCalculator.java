package D59_AtomicVariable.DC_T_3_AtomicIntPriceCalc.No;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;
public class AtomicIntegerPriceCalculator {
    public static void main(String[] args) {
        AtomicInteger totalPrice = new AtomicInteger(0);
        int numThreads = 5; // Number of threads
        int itemsPerThread = 10; // Number of items to add per thread
        // Create an array to hold thread references
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new AddItemPriceTask(itemsPerThread,
                    totalPrice));
            threads[i].start();
        }
        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int finalTotalPrice = totalPrice.get();
        System.out.println("Total Price: $" + finalTotalPrice);
    }
}
class AddItemPriceTask implements Runnable {
    private int numItems;
    private AtomicInteger totalPrice;
    private Random random = new Random();
    public AddItemPriceTask(int numItems, AtomicInteger totalPrice) {
        this.numItems = numItems;
        this.totalPrice = totalPrice;
    }
    @Override
    public void run() {
        for (int i = 0; i < numItems; i++) {
            int itemPrice = random.nextInt(100); // Generate a random item price (0 to 99)
            totalPrice.addAndGet(itemPrice);

        }

    }
}
