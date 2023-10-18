package D54_Synchronized.T3_TicketSystem;

class TicketBookingSystem {
    private int totalTickets;

    public synchronized void bookTicket(User user) {
        if (totalTickets > 0) {
            totalTickets--;
            System.out.println(user.getName() + " has bought  a ticket successfully. Tickets left: " + totalTickets);
        } else {
            System.out.println("Sorry, no tickets left for " + user.getName());
        }
    }
    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getTotalTickets() {
        return totalTickets;
    }
}

class User extends Thread {
    private TicketBookingSystem ticketBookingSystem;

    public User(TicketBookingSystem ticketBookingSystem, String userNo) {
//        Constructor of super class.
        super(userNo);
        this.ticketBookingSystem = ticketBookingSystem;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            ticketBookingSystem.bookTicket(this);
        }
    }
}

public class TicketBookingExercise {
    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
        ticketBookingSystem.setTotalTickets(11);
        System.out.println("Total amount of tickets: " + ticketBookingSystem.getTotalTickets());

        User[] users = new User[5];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(ticketBookingSystem, "User" + (i + 1));
            users[i].start();
        }
    }
}
