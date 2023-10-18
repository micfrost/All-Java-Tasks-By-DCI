package D54_Synchronized.T3_DC;

class TicketBookingSystem {
    private int totalTickets;
    public TicketBookingSystem(int initialTickets) {
        this.totalTickets = initialTickets;
    }
    public synchronized void bookTicket(User user) {
        if (totalTickets > 0) {
            totalTickets--;
            System.out.println(user.getName() + " booked a ticket.");
        } else {
            System.out.println("No tickets available for " + user.getName());
        }
    }
    public int getAvailableTickets() {
        return totalTickets;
    }
}


class User extends Thread {
    private TicketBookingSystem ticketBookingSystem;
    public User(TicketBookingSystem ticketBookingSystem, String name) {
        super(name);
        this.ticketBookingSystem = ticketBookingSystem;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) { // Attempt to book tickets 3 times
            ticketBookingSystem.bookTicket(this);
            try {
                Thread.sleep(100); // Sleep to simulate user behavior
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class TicketBookingExercise {
    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);
        //Initialize with 10 tickets
        User[] users = new User[5];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(ticketBookingSystem, "User " + (i + 1));
            users[i].start();
        }
    }
}