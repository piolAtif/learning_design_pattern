package strategyPattern;

public class Item {
    private final String sweetCategory;
    private final double price;
    private final int quantity;

    public Item(String sweetCategory, double price, int quantity) {
        this.sweetCategory = sweetCategory;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
