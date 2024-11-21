package airline_ticket_booking_system;

public class Seat {
    protected int seat_number;
    protected long price;
    protected boolean status;

    public Seat(int seat_number, long price, boolean status) {
        this.seat_number = seat_number;
        this.price = price;
        this.status = status;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void caculate_final_price() {

    }

    @Override
    public String toString() {
        return "seat_number: " + seat_number +
                ", price: " + price +
                ", status: " + status;
    }
}
