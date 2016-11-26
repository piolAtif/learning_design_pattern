package strategyPattern;

public class LoyalDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double price) {
        return price*0.8;
    }
}
