package D77_enums.T1_TicketReservSystem.micfro;
public class Passenger {
    String passengerName;
    SeatClass seatClass;
    double ticketPrice;
    public void setTicketPrice(SeatClass seatClass) {
        switch (seatClass) {
            case FIRST_CLASS -> ticketPrice = 1000;
            case BUSINESS_CLASS -> ticketPrice = 500;
            case ECONOMY_CLASS -> ticketPrice = 200;}}
    public Passenger(String passengerName, SeatClass seatClass) {
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        setTicketPrice(seatClass);}
    @Override
    public String toString() {
        return "Passenger: " + passengerName + ", Seat Class=: " + seatClass +
                ", Ticket Price: " + String.format("%.2f", ticketPrice)+
                " €.";}}