package D59_AtomicVariable.DC_T_3_AtomicIntPriceCalc.MJ_implementsRunnable;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class AddingProducts implements Runnable {

    private AtomicInteger totalPrice = new AtomicInteger();
    private Random random = new Random();
    private int productPrice = random.nextInt(20) + 1;

    public AddingProducts(AtomicInteger totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public void run() {
        totalPrice.addAndGet(productPrice);
        System.out.println("Product price: \t" + productPrice);
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger totalPrice = new AtomicInteger();

        Thread[] threads = new Thread[3];
        int index = 0;
        for (Thread thread : threads) {
            threads[index] = new Thread(new AddingProducts(totalPrice));
            threads[index].start();
            threads[index].join();
            index++;
        }

        System.out.println("- - - - - - - - - ");
        System.out.println("Total price: \t" + totalPrice);
    }
}
