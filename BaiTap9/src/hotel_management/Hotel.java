package hotel_management;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends HotelRoom {
    private List<HotelRoom> rooms;
    private static long total_revenue = 0;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public Hotel(int roomNumber, int capacity, double price_per_night, boolean status) {
        super(roomNumber, capacity, price_per_night, status);
    }

    public List<HotelRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<HotelRoom> rooms) {
        this.rooms = rooms;
    }

    public static long getTotal_revenue() {
        return total_revenue;
    }

    public static void setTotal_revenue(long total_revenue) {
        Hotel.total_revenue = total_revenue;
    }

    //search room
    public void search_room(int capacity) {
        boolean flag = false;
        for (HotelRoom room : rooms) {
            if (room.getCapacity() >= capacity) {
                if (!room.isStatus()) {
                    flag = true;
                    System.out.println(room);
                }
            }

        }
        if (!flag) {
            System.out.println("No more!");
        }
    }

    //caculate revenue
    public static long caculate_revenue(List<HotelRoom> rooms) {
        for (HotelRoom room : rooms) {
            if (room.isStatus()) {
                total_revenue += (long) room.getPrice_per_night();
            }
        }
        return total_revenue;
    }

    //show room
    public void show_room() {
        boolean flag = false;
        for (HotelRoom room : rooms) {
            flag = true;
            System.out.println(room);
        }
        if (!flag) {
            System.out.println("Out of room");
        }
    }
}
