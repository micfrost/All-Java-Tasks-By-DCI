package D57_Semaphore.DC_T_2_RestaurantSeatingSystem.MJ;

import java.util.concurrent.Semaphore;


public class Main {
    Semaphore tableSemathor = new Semaphore(0);

    public static void main(String[] args) {
        Main seating = new Main();
        ClientCouple ClientCouple1 = seating.new ClientCouple();
        ClientCouple1.start();
        ClientCouple ClientCouple2 = seating.new ClientCouple();
        ClientCouple2.start();
        ClientCouple ClientCouple3 = seating.new ClientCouple();
        ClientCouple3.start();
        ClientCouple ClientCouple4 = seating.new ClientCouple();
        ClientCouple4.start();

        Main.TableForTwo tableForTwo1 = seating.new TableForTwo();
        tableForTwo1.start();
        Main.TableForTwo tableForTwo2 = seating.new TableForTwo();
        tableForTwo2.start();
        Main.TableForTwo tableForTwo3 = seating.new TableForTwo();
        tableForTwo3.start();
        Main.TableForTwo tableForTwo4 = seating.new TableForTwo();
        tableForTwo4.start();
    }

    class ClientCouple extends Thread {
        @Override
        public void run() {
            try {
                tableSemathor.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A Couple has taken a seat and they are eating. It is going take them 6sek.");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A Couple  has finished eating and they are leaving. Thank you and Bye Bye.");
        }
    }

    class TableForTwo extends Thread {
        @Override
        public void run() {
            System.out.println(" - - - Table for a couple is being prepared, wait 4 sek.");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" - - - Table for a couple  people is ready to be taken");
            tableSemathor.release();
        }
    }

}
