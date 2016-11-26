package strategyPattern;

public class VoucherDiscountStrategy implements DiscountStrategy {
    @Override
    public double discount(double price) {
        return  price-10;
    }
}
