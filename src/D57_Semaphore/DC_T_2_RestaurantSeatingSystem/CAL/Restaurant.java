package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.CAL;

public class Restaurant {

	private static final int capacity = 10;
	private int tables;
	private String restaurantName;

	public Restaurant(String restaurantName) {
		this.restaurantName = restaurantName;
		tables = capacity;
	}

	public int getTables() {
		return tables;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public static int getCapacity() {
		return capacity;
	}

	public int gettingTable() {
		synchronized (this) {
			if (tables > 0) {
				System.out.println("Busy Table.");
				return tables--;
			}
			System.out.println("All tables are busy, please wait!");
			return 0;
		}
	}

	public void leavingTable() throws InterruptedException {
		synchronized (this) {
			if (tables < capacity) {

				Thread.sleep(3000);

				tables++;
				System.out.println("Customers left the table!");
			} else {
				System.out.println("Table already empty.");
			}
		}
	}

}
