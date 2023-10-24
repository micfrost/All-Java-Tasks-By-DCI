package D57_Semaphore.DC_CA_1_Creating;

import java.util.concurrent.Semaphore;

public class Application {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

//        decrease a number of available Semaphores
//        It is like lock in ReentrantLock
        try {
            semaphore.acquire();
            System.out.println();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        increase a number of available Semaphores
//        It is like unlock in ReentrantLock
        semaphore.release();

        System.out.println("Numbert of permitse: " + semaphore.availablePermits());
    }
}
