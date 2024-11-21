package electronic_store_management_system;

public class Product {
    protected String id;
    protected String name;
    protected long price;
    protected int quantity;

    public Product(String id, String name, long price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void caculate_discounted_price(int discount_rate) {
        long total = this.price - this.price * discount_rate / 100;
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
