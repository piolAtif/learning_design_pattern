package strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private DiscountStrategy customerType;
    private List<Item> items = new ArrayList<>();

    public Customer(DiscountStrategy customerType) {
        this.customerType = customerType;
    }

    public void add(String sweetCategory, double price, int quantity){
        items.add(new Item(sweetCategory, price, quantity));
    }

    public double totalPrice() {
        double total = 0;
        for (Item item : this.items) {
          total += customerType.discount(item.getTotalPrice());
        }
        return  total;
    }
}
