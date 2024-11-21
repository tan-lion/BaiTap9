package electronic_store_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Laptop("LT01", "Asus", 20000000, 5, "Intel i7", "16GB");
        Product laptop_2 = new Laptop("LT02", "Dell", 21000000, 6, "Intel i9", "32GB");
        Product smart_phone = new SmartPhone("SM01", "Iphone", 12000000, 4, "32MP");
        Product smart_phone_2 = new SmartPhone("SM02", "SamSung", 13000000, 5, "108MP");
        Product tablet = new Tablet("TB01", "Ipad", 16000000, 4);
        Product tablet_2 = new Tablet("TB01", "Ipad_2", 17000000, 5);

        List<Product> products_list = new ArrayList<>();
        products_list.add(laptop);
        products_list.add(laptop_2);
        products_list.add(smart_phone);
        products_list.add(smart_phone_2);
        products_list.add(tablet);
        products_list.add(tablet_2);

        for (Product product : products_list) {
            System.out.println(product.toString());
            product.caculate_discounted_price(50);
        }
    }
}
