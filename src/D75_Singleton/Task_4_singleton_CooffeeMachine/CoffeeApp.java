package D75_Singleton.Task_4_singleton_CooffeeMachine;

import static java.lang.Thread.currentThread;

class CoffeeMachine {
    // Step 1 Class Instance
    private static CoffeeMachine coffeeMachineInstance;
    private int coffeeBeans;
    private int waterLevel;

    // Step 2 Stop the Constructor for outside
    private CoffeeMachine() {
        coffeeBeans = 0;
        waterLevel = 0;
    }

    // Step 3 Double-checked locking for Multithreading
    public static CoffeeMachine getInstance() {
        if (coffeeMachineInstance == null) {
            synchronized (CoffeeMachine.class) {
                if (coffeeMachineInstance == null) coffeeMachineInstance = new CoffeeMachine();
            }
        }
        return coffeeMachineInstance;
    }

    void brewingCoffee() {
        if (coffeeBeans > 0 && waterLevel > 0) {
            coffeeBeans--;
            waterLevel--;
            System.out.println("Coffee brewed! YEAH !");
        } else if (coffeeBeans == 0) {
            System.out.println("Cannot brew. Refill coffee beans.");
        } else {
            System.out.println("Cannot brew. Check water level.");
        }
    }

    void refillingBeans() {
        if (coffeeBeans < 5) {
            coffeeBeans += 5;
            System.out.println("Coffee beans refilled. Current beans: " + coffeeBeans);
        } else {
            System.out.println("There is enough coffee beans. Beans not added. Level: " + coffeeBeans);
        }
    }

    void checkingWater() {
        System.out.println("Current water level: " + waterLevel);
    }

    public synchronized void addWater() {
        if (waterLevel < 5) {

            waterLevel += 5;
            System.out.println("Water added. Current water level: " + waterLevel);
        } else {
            System.out.println("There is enough water. Water not added. Level: " + coffeeBeans);
        }
    }
}

public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();

        Runnable task = () -> {
            coffeeMachine.checkingWater();
            coffeeMachine.refillingBeans();
            coffeeMachine.addWater();
            coffeeMachine.brewingCoffee();
        };

        Thread[] threads = new Thread[15];
        for (int i = 0; i < 15; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        try {
            for (Thread thread : threads) thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" - - ");
        System.out.println("The coffee was enjoyed to the last drop.");
    }
}