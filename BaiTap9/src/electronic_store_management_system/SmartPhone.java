package electronic_store_management_system;

public class SmartPhone extends Product {
    private String camera_quality;

    public SmartPhone(String id, String name, long price, int quantity, String camera_quality) {
        super(id, name, price, quantity);
        this.camera_quality = camera_quality;
    }

    public String getCamera_quality() {
        return camera_quality;
    }

    public void setCamera_quality(String camera_quality) {
        this.camera_quality = camera_quality;
    }

    @Override
    public void caculate_discounted_price(int discount_rate) {
        long total = this.price - this.price * discount_rate / 100 - 10000;
        System.out.println("Price after discount: " + total);
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", price: " + price +
                ", quantity: " + quantity +
                ", camera_quality: " + camera_quality;
    }
}
