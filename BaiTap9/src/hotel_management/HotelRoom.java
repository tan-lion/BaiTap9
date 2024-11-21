package hotel_management;

public class HotelRoom {
    private int roomNumber;
    private int capacity;
    private double price_per_night;
    private boolean status;

    public HotelRoom(int roomNumber, int capacity, double price_per_night, boolean status) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.price_per_night = price_per_night;
        this.status = status;
    }

    public HotelRoom() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice_per_night() {
        return price_per_night;
    }

    public void setPrice_per_night(double price_per_night) {
        this.price_per_night = price_per_night;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room number: " + roomNumber +
                ", Capacity: " + capacity +
                ", Price per night: " + price_per_night +
                ", Status:" + status;
    }

    public void book_room() {
        this.status = true;
        System.out.println("Booking successfully!");
    }

    public void checkout() {
        this.status = false;
        System.out.println("Checkout successfully!");
    }

}
