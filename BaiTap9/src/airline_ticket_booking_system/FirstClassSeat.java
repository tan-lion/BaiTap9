package airline_ticket_booking_system;

public class FirstClassSeat extends Seat {

    public FirstClassSeat(int seat_number, long price, boolean status) {
        super(seat_number, price, status);
    }

    @Override
    public void caculate_final_price() {

    }

    @Override
    public String toString() {
        return "seat_number: " + seat_number +
                ", price: " + price +
                ", status: " + status;
    }
}
