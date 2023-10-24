package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.CAL;

import java.util.concurrent.Semaphore;

public class BookTable {

	private Restaurant restaurant;
	private Semaphore semaphore = new Semaphore(10);

	public BookTable(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public void tablesAvailability() {
		try {
			try {
				semaphore.acquire();

				restaurant.gettingTable();

				Thread.sleep(1000);

			} finally {
				semaphore.release();
			}

			restaurant.leavingTable();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
