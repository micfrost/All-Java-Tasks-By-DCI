package D53_Thread.T3_TrafficIntersection;
import java.util.Random;
class TrafficLane extends Thread {
    Random random = new Random();
    int numberOfCars = random.nextInt(7);
    public void run() {
        System.out.println();
        System.out.println("Traffic Simulation.");
        System.out.println("Green, Go Go Go: ");
        for (int i = 1; i <= numberOfCars; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Car " + i + " is crossing successfully.");
            } catch (InterruptedException e) {
                System.out.println("Oh no: " + e);
            }
        }
        System.out.println("Stop stop stooooop. The traffic light is red.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class TrafficIntersectionSimulation {
    public static void main(String[] args) {

//      Creating threads
        TrafficLane direction1NW = new TrafficLane();
        TrafficLane direction2EW = new TrafficLane();
        TrafficLane direction3DI = new TrafficLane();

//      direction1NW
        System.out.println("North-West Lane");
        direction1NW.start();
        try {
            direction1NW.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//      direction2EW
        System.out.println("Eas-West Lane");
        direction2EW.start();
        try {
            direction2EW.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//      direction3DI
        System.out.println("Diagonal Lane");
        direction3DI.start();
        try {
            direction3DI.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
