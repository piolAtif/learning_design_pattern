package strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeDiscountStrategy implements DiscountStrategy{
    private List<DiscountStrategy> strategies = new ArrayList<>();

    @Override
    public double discount(double price) {
        double totalPrice = 0;
        for (DiscountStrategy strategy : this.strategies) {
            totalPrice += strategy.discount(price);
        }
        return  totalPrice;
    }

    public void addDiscountStrategy(DiscountStrategy discountStrategy){
        strategies.add(discountStrategy);
    }
}
