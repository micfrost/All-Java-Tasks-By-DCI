package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.NO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class RestaurantSeatingExercise {
    public static void main(String[] args) {
        int seatingCapacity = 5; // Total number of available seats
        int totalCustomers = 10; // Total number of customers
        Restaurant restaurant = new Restaurant(seatingCapacity);
        //creates a fixed-size thread pool with a number of threads equal to totalCustomers.
        ExecutorService executor = Executors.newFixedThreadPool(totalCustomers);

        //for loop that will iterate from 1 to totalCustomers.
        // It is used to simulate multiple customers.
        for (int i = 1; i <= totalCustomers; i++) {
            // a new CustomerTask object is created, representing a customer's task.
            // It is passed the restaurant instance and the customer's ID (i) as arguments.
            Runnable task = new CustomerTask(restaurant, i);

            //executor executes the task, which is an instance of the CustomerTask class.
            // This means that each customer's task will be executed concurrently as a separate thread
            // within the thread pool managed by the executor.

            executor.execute(task);
        }

        //After all customers have been created and their tasks have been executed,
        // this line shuts down the executor. This means that no more tasks will be accepted,
        // and the program will terminate once all tasks are completed.
        executor.shutdown();
    }
}
class Restaurant {

    //private member variable semaphore of type Semaphore.
    // The Semaphore is used to control access to the restaurant's seating capacity.

    private Semaphore semaphore;

    //constructor for the Restaurant class.
    // It takes the seatingCapacity as an argument and initializes the semaphore with that capacity.
    public Restaurant(int seatingCapacity) {
        semaphore = new Semaphore(seatingCapacity);
    }

    //This method is used by customers to enter the restaurant.
    // It can throw an InterruptedException if a thread is interrupted while waiting.
    public void enterRestaurant() throws InterruptedException {

        //acquire method of the semaphore to block the thread until a seat becomes available.
        // It's a way to ensure that the restaurant's seating capacity is not exceeded.
        semaphore.acquire();
    }

    //This method is used by customers to leave the restaurant.
    public void leaveRestaurant() {
        //release method of the semaphore to release a seat, allowing other customers to enter.
        semaphore.release();
    }
}
class CustomerTask implements Runnable {
    private Restaurant restaurant;
    private int customerId;
    public CustomerTask(Restaurant restaurant, int customerId) {
        this.restaurant = restaurant;
        this.customerId = customerId;
    }
    @Override
    public void run() {
        try {
            //Here, the customer enters the restaurant by calling the enterRestaurant method of the restaurant object.
            // This method may throw an InterruptedException, which is why it's inside a try-catch block.
            restaurant.enterRestaurant();

            //message to the console indicating that a customer with a specific ID has entered the restaurant.
            System.out.println("Customer " + customerId + " entered the restaurant.");
            Thread.sleep(2000); // Simulate dining

            //After dining, the customer leaves the restaurant
            // by calling the leaveRestaurant method of the restaurant object.
            restaurant.leaveRestaurant();

            //message to the console indicating that the customer with a specific ID has left the restaurant.
            System.out.println("Customer " + customerId + " left the restaurant.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
