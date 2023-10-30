package D59_AtomicVariable.DC_T_3_AtomicIntPriceCalc.CH;
import java.util.concurrent.atomic.AtomicInteger;

class ShopperThread extends Thread {
    private AtomicInteger totalPrice;
    private int[] itemPrices;

    public ShopperThread(AtomicInteger totalPrice, int[] itemPrices) {
        this.totalPrice = totalPrice;
        this.itemPrices = itemPrices;
    }

    @Override
    public void run() {
        for (int i = 0; i < itemPrices.length; i++) {
            int itemPrice = itemPrices[i];
            totalPrice.addAndGet(itemPrice);
        }
    }
}

public class AtomicIntegerPriceCalculator {
    public static void main(String[] args) {
        // Initialize an AtomicInteger to store the total price.
        AtomicInteger totalPrice = new AtomicInteger(0);

        // Define the prices of items.
        int[] itemPrices = {10, 20, 30, 40, 50}; // Sample item prices.

        // Create and start multiple threads (shoppers) to simulate adding prices to the cart.
        int numThreads = 5; // You can adjust this as needed.
        ShopperThread[] shoppers = new ShopperThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            shoppers[i] = new ShopperThread(totalPrice, itemPrices);
            shoppers[i].start();
        }

        // Wait for all threads to complete.
        for (ShopperThread shopper : shoppers) {
            try {
                shopper.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calculate and display the final total price.
        int finalTotal = totalPrice.get();
        System.out.println("Final Total Price: " + finalTotal + "€");
    }
}
