package airline_ticket_booking_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare
        Seat firstClassSeat = new FirstClassSeat(1, 10000000, false);
        Seat firstClassSeat_2 = new FirstClassSeat(2, 10000000, false);
        Seat firstClassSeat_3 = new FirstClassSeat(3, 10000000, false);

        Seat economySeat = new EconomySeat(11, 9000000, false);
        Seat economySeat_2 = new EconomySeat(12, 9000000, false);
        Seat economySeat_3 = new EconomySeat(13, 9000000, false);

        Seat bussinessSeat = new BusinessSeat(21, 8000000, false);
        Seat bussinessSeat_2 = new BusinessSeat(22, 8000000, false);
        Seat bussinessSeat_3 = new BusinessSeat(23, 8000000, false);
        Flight flight = new Flight();
        flight.getSeats().add(firstClassSeat);
        flight.getSeats().add(firstClassSeat_2);
        flight.getSeats().add(firstClassSeat_3);
        flight.getSeats().add(economySeat);
        flight.getSeats().add(economySeat_2);
        flight.getSeats().add(economySeat_3);
        flight.getSeats().add(bussinessSeat);
        flight.getSeats().add(bussinessSeat_2);
        flight.getSeats().add(bussinessSeat_3);

        //Input
        int choice;
        do {
            System.out.println("===================");
            System.out.println("1. Book seat. ");
            System.out.println("2. Total revenue. ");
            System.out.println("3. List seat. ");
            System.out.println("===================");
            System.out.println("Enter choose: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter seat number: ");
                    int seatNumber = sc.nextInt();
                    flight.book_seat(seatNumber);
                    break;
                case 2:
                    flight.caculate_total_revenue();
                    break;
                case 3:
                    System.out.println("List seat: ");
                    flight.display_seat();
                    break;
            }
        } while (choice != 0);


    }
}
