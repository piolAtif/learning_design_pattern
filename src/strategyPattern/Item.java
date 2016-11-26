package strategyPattern;

public class Item {
    private final String item;
    private final double price;
    private final int quantity;

    public Item(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price*quantity;
    }
}
