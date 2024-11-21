package electronic_store_management_system;

public class Laptop extends Product {
    private String proccessor;
    private String ram;

    public Laptop(String id, String name, long price, int quantity, String proccessor, String ram) {
        super(id, name, price, quantity);
        this.proccessor = proccessor;
        this.ram = ram;
    }

    public String getProccessor() {
        return proccessor;
    }

    public void setProccessor(String proccessor) {
        this.proccessor = proccessor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void caculate_discounted_price(int discount_rate) {
        long total = this.price - this.price * discount_rate / 100 - 5000;
        System.out.println("Price after discount: " + total);
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", price: " + price +
                ", quantity: " + quantity +
                ", proccessor: " + proccessor +
                ", ram: " + ram;
    }
}
