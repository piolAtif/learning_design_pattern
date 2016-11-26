package strategyPattern;

/**
 * Created by preetisharma on 26/11/2016.
 */
public class LoyalDiscountStrategy implements DiscountStrategy{
    @Override
    public double discount(double price) {
        return price*0.8;
    }
}
