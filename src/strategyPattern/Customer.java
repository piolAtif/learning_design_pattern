package strategyPattern;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private DiscountStrategy discountStrategy;
    private List<Item> items = new ArrayList<>();

    public Customer(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addItem(String item, double price, int quantity){
        items.add(new Item(item, price,quantity));
    }

    public double totalBill() {
        int totalPrice = 0;
        for (Item item : this.items) {
            totalPrice += discountStrategy.discount(item.getTotalPrice());
        }
        return  totalPrice;
    }
}
