package D77_enums.T1_TicketReservSystem.micfro;

import java.util.ArrayList;

public class Flight {
    ArrayList<Passenger> passengerList = new ArrayList<>();
    private double totalRevenue;

    void reserveSeat(String passengerName, SeatClass seatClass) {
        passengerList.add(new Passenger(passengerName, seatClass));
    }

    //        Removing using not During Iteration
    void cancelReservation1(String passengerName) {
        Passenger toRemove = null;
        for (Passenger element : passengerList) {
            if (element.passengerName.equals(passengerName)) {
                toRemove = element;
            }
        }
        System.out.println("- - -");
        if (toRemove != null) {
            passengerList.remove(toRemove);
            System.out.println("Reservation for " + passengerName + " has been cancel successfully.");
        } else {
            System.out.println("there is no reservation for  " + passengerName);
        }
    }

    //        Removing using removeIf()
    void cancelReservation2(String passengerName) {
        boolean passengerFound = false;
        for (Passenger element : passengerList) {
            if (element.passengerName.equals(passengerName)) {
                passengerFound = true;
                break;
            }    }
        System.out.println("- - -");
            if (passengerFound) {
                passengerList.removeIf(element -> element.passengerName.equals(passengerName));
                System.out.println("Reservation for " + passengerName + " has been canceled successfully.");
            } else {
                System.out.println("No reservation found for " + passengerName);
            }

    }
    void displayPassengerList() {
        System.out.println("- - -");
        System.out.println("Reservation List: ");
        passengerList.forEach(element -> System.out.println(element));
    }

    void totalRevenue() {
        for (Passenger element : passengerList) {
            totalRevenue += element.ticketPrice;
        }
        System.out.println("- - -");
        System.out.printf("Total Revenue: %.2f €.", totalRevenue);
    }
}