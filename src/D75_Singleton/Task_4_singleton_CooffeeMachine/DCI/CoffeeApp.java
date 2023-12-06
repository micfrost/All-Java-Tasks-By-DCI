package D75_Singleton.Task_4_singleton_CooffeeMachine.DCI;

class CoffeeMachine {
    private static CoffeeMachine instance;
    private int coffeeBeans;
    private int waterLevel;

    private CoffeeMachine() {
        coffeeBeans = 0;
        waterLevel = 0;
    }

    public static CoffeeMachine getInstance() {
        if (instance == null) {
            synchronized (CoffeeMachine.class) {
                if (instance == null) {
                    instance = new CoffeeMachine();
                }
            }
        }
        return instance;
    }

    public void makeCoffee() {
        if (coffeeBeans > 0 && waterLevel > 0) {
            coffeeBeans--;
            waterLevel--;
            System.out.println("Brewing a delicious cup of coffee!");
        } else {
            System.out.println("Cannot brew. Insufficient coffee beans or water.");
        }
    }

    public void refillCoffeeBeans(int quantity) {
        coffeeBeans += quantity;
        System.out.println("Refilled coffee beans. Current quantity: " + coffeeBeans);
    }

    public void checkWaterLevel() {
        System.out.println("Water level: " + waterLevel);
    }

    public void refillWater(int quantity) {
        waterLevel += quantity;
        System.out.println("Refilled water. Current level: " + waterLevel);
    }
}

public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();

        int numThreads = 3;

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                CoffeeMachine threadCoffeeMachine = CoffeeMachine.getInstance();
                threadCoffeeMachine.makeCoffee();
                threadCoffeeMachine.refillCoffeeBeans(5);
                threadCoffeeMachine.checkWaterLevel();
                threadCoffeeMachine.refillWater(3);
            });
            thread.start();
        }
    }
}