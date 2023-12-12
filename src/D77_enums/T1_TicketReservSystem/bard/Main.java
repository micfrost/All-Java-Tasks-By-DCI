package D77_enums.T1_TicketReservSystem.bard;

import java.util.ArrayList;
import java.util.List;

enum SeatClass {
    FIRST_CLASS(900.0),
    BUSINESS_CLASS(600.0),
    ECONOMY_CLASS(400.0);

    private final double basePrice;

    SeatClass(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}

class Passenger {
    String passengerName;
    SeatClass seatClass;
    double ticketPrice;

    public Passenger(String passengerName, SeatClass seatClass) {
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        this.ticketPrice = calculateTicketPrice();
    }

    private double calculateTicketPrice() {
        return seatClass.getBasePrice();
    }
}

class Flight {
    List<Passenger> passengerList = new ArrayList<>();

    public void reserveSeat(String passengerName, SeatClass seatClass) {
        Passenger passenger = new Passenger(passengerName, seatClass);
        passengerList.add(passenger);
    }

    public void cancelReservation(String passengerName) {
        passengerList.removeIf(passenger -> passenger.passengerName.equals(passengerName));
    }

    public void displayPassengerList() {
        for (Passenger passenger : passengerList) {
            System.out.println("Passenger: " + passenger.passengerName +
                    " | Seat Class: " + passenger.seatClass +
                    " | Ticket Price: $" + passenger.ticketPrice);
        }
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0.0;
        for (Passenger passenger : passengerList) {
            totalRevenue += passenger.ticketPrice;
        }
        return totalRevenue;
    }
}

public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight();

        flight.reserveSeat("Bob Smith", SeatClass.FIRST_CLASS);
        flight.reserveSeat("Mary Travis", SeatClass.BUSINESS_CLASS);

        System.out.println("Passenger List after Reservations:");
        flight.displayPassengerList();

        flight.cancelReservation("Mary Travis");

        System.out.println("\nPassenger List after Cancellation:");
        flight.displayPassengerList();

        System.out.println("\nTotal Revenue: $" + flight.calculateTotalRevenue());
    }
}

