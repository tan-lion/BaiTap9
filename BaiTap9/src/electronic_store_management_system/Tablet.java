package electronic_store_management_system;

public class Tablet extends Product {
    public Tablet(String id, String name, long price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public void caculate_discounted_price(int discount_rate) {
        long total = this.price - this.price * discount_rate / 100 - 9000;
        System.out.println("Price after discount: " + total);
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", price: " + price +
                ", quantity: " + quantity;
    }
}
