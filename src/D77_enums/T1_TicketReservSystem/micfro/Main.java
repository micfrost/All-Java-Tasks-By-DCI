package D77_enums.T1_TicketReservSystem.micfro;
import static D77_enums.T1_TicketReservSystem.micfro.SeatClass.*;
public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight();
        flight1.reserveSeat("Robert Tortoni", FIRST_CLASS);
        flight1.reserveSeat("John Badminton", BUSINESS_CLASS);
        flight1.reserveSeat("Monto Dorto Senior", ECONOMY_CLASS);
        flight1.reserveSeat("Monto Dorto Junior", ECONOMY_CLASS);
        flight1.displayPassengerList();
        flight1.cancelReservation1("Monto Dorto Senior");
        flight1.cancelReservation2("Monto Dorto Junior");
        flight1.displayPassengerList();
        flight1.totalRevenue();
    }
}
