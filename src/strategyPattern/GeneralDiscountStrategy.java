package strategyPattern;

public class GeneralDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double price) {
        return price;
    }
}
