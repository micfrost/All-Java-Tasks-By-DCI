package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.CAL;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	private static int customers = 30;

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();

		Restaurant restaurant = new Restaurant("Mc Donalds");
		BookTable bookTable = new BookTable(restaurant);

		// The for loop represents the number of customers.
		for (int i = 0; i < customers; i++) {

			executor.submit(new Runnable() {

				@Override
				public void run() {

					bookTable.tablesAvailability();
				}
			});
		}

		executor.shutdown();

		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
