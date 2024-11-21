package hotel_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare
        HotelRoom hotelRoom = new HotelRoom(201, 4, 200000, false);
        HotelRoom hotelRoom_1 = new HotelRoom(202, 5, 250000, false);
        HotelRoom hotelRoom_2 = new HotelRoom(203, 6, 300000, false);
        HotelRoom hotelRoom_3 = new HotelRoom(204, 7, 350000, false);
        Hotel hotel = new Hotel();
        int choose = 0, number;

        //Input
        hotel.getRooms().add(hotelRoom);
        hotel.getRooms().add(hotelRoom_1);
        hotel.getRooms().add(hotelRoom_2);
        hotel.getRooms().add(hotelRoom_3);

        //Conditional
        do {

            System.out.println("==================================");
            System.out.println("1. Book room.");
            System.out.println("2. Checkout.");
            System.out.println("3. Show room.");
            System.out.println("4. Total revenue.");
            System.out.println("5. Search room.");
            System.out.println("0. Exit");
            System.out.println("==================================");
            System.out.println("Enter choose: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Enter room number: ");
                    number = sc.nextInt();
                    for (HotelRoom room : hotel.getRooms()) {
                        if (room.getRoomNumber() == number) {
                            if (!room.isStatus()) {
                                room.book_room();
                            } else {
                                System.out.println("Room is booked.");
                            }
                        }
                    }
                    break;
                case 2:

                    System.out.println("Enter room number: ");
                    number = sc.nextInt();
                    for (HotelRoom room : hotel.getRooms()) {
                        if (room.getRoomNumber() == number) {
                            if (room.isStatus()) {
                                room.checkout();
                            } else {
                                System.out.println("Room has not been booked yet.");
                            }
                        }
                    }
                    break;
                case 3:
                    hotel.show_room();
                    break;
                case 4:
                    System.out.println("Total revenue:" + hotel.caculate_revenue(hotel.getRooms()));
                    break;
                case 5:
                    System.out.println("Enter capacity number: ");
                    number = sc.nextInt();
                    hotel.search_room(number);
            }
        } while (choose != 0);
    }
}
