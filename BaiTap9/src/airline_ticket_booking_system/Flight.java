package airline_ticket_booking_system;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Seat> seats;
    private static long total_revenue = 0;

    public Flight() {
        seats = new ArrayList<Seat>();
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    //book seat
    public void book_seat(int seat_number) {
        boolean flag = false;
        for (Seat seat : seats) {
            if (seat_number == seat.getSeat_number()) {
                if (!seat.isStatus()) {
                    flag = true;
                    seat.setStatus(true);
                }
            }
        }
        if (!flag) {
            System.out.println("The seat has been booked or does not exist.");
        }
    }

    //caculate total revenue
    public void caculate_total_revenue() {
        for (Seat seat : seats) {
            if (seat.isStatus()) {
                total_revenue += seat.getPrice();
            }
        }
        System.out.println("Total revenue: " + total_revenue);
    }

    public void display_seat() {
        for (Seat seat : seats) {
            System.out.println(seat);
        }
    }
}
