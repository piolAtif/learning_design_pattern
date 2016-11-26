package strategyPattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void should_give_two_hundred_forty_for_general_customer_for_cake_item(){
        DiscountStrategy  generalDiscountStrategy= new GeneralDiscountStrategy();
        Customer general = new Customer(generalDiscountStrategy);
        general.addItem("cake",120.0,2);
        assertEquals(240.0, general.totalBill(),0.1);
    }

    @Test
    public void should_give_one_hundred_ninty_two_for_loyal_customer_for_cake_item(){
        DiscountStrategy  loyalDiscountStrategy= new LoyalDiscountStrategy();
        Customer loyal = new Customer(loyalDiscountStrategy);
        loyal.addItem("cake",120.0,2);
        assertEquals(192.0, loyal.totalBill(), 0.1);
    }

    @Test
    public void should_give_two_hundred_thirty_for_voucher_customer_for_cake_item(){
        DiscountStrategy  voucherDiscountStrategy= new VoucherDiscountStrategy();
        Customer voucher = new Customer(voucherDiscountStrategy);
        voucher.addItem("cake",120.0,2);
        assertEquals(230.0, voucher.totalBill(), 0.1);
    }

    @Test
    public void should_give_four_hundred_twenty_two_for_loyal_and_voucher_composite_customer_for_cake_item(){
        DiscountStrategy  loyalDiscountStrategy= new LoyalDiscountStrategy();
        DiscountStrategy  voucherDiscountStrategy= new VoucherDiscountStrategy();
        CompositeDiscountStrategy compositeDiscountStrategy= new CompositeDiscountStrategy();
        compositeDiscountStrategy.addDiscountStrategy(loyalDiscountStrategy);
        compositeDiscountStrategy.addDiscountStrategy(voucherDiscountStrategy);
        Customer composite = new Customer(compositeDiscountStrategy);
        composite.addItem("cake", 120.0, 2);
        assertEquals(422.0, composite.totalBill(), 0.1);
    }

    @Test
    public void should_give_four_hundred_seventy_for_general_and_voucher_composite_customer_for_cake_item(){
        DiscountStrategy  generalDiscountStrategy= new GeneralDiscountStrategy();
        DiscountStrategy  voucherDiscountStrategy= new VoucherDiscountStrategy();
        CompositeDiscountStrategy compositeDiscountStrategy= new CompositeDiscountStrategy();
        compositeDiscountStrategy.addDiscountStrategy(generalDiscountStrategy);
        compositeDiscountStrategy.addDiscountStrategy(voucherDiscountStrategy);
        Customer composite = new Customer(compositeDiscountStrategy);
        composite.addItem("cake", 120.0, 2);
        assertEquals(470.0, composite.totalBill(), 0.1);
    }

    @Test
    public void should_give_four_hundred_thirty_two_for_loyal_and_general_composite_customer_for_cake_item(){
        DiscountStrategy  loyalDiscountStrategy= new LoyalDiscountStrategy();
        DiscountStrategy  generalDiscountStrategy= new GeneralDiscountStrategy();
        CompositeDiscountStrategy compositeDiscountStrategy= new CompositeDiscountStrategy();
        compositeDiscountStrategy.addDiscountStrategy(loyalDiscountStrategy);
        compositeDiscountStrategy.addDiscountStrategy(generalDiscountStrategy);
        Customer composite = new Customer(compositeDiscountStrategy);
        composite.addItem("cake", 120.0, 2);
        assertEquals(432.0, composite.totalBill(), 0.1);
    }

    @Test
    public void should_give_six_hundred_sixty_two_for_loyal_general_and_voucher_composite_customer_for_cake_item(){
        DiscountStrategy  loyalDiscountStrategy= new LoyalDiscountStrategy();
        DiscountStrategy  voucherDiscountStrategy= new VoucherDiscountStrategy();
        DiscountStrategy  generalDiscountStrategy= new GeneralDiscountStrategy();
        CompositeDiscountStrategy compositeDiscountStrategy= new CompositeDiscountStrategy();
        compositeDiscountStrategy.addDiscountStrategy(loyalDiscountStrategy);
        compositeDiscountStrategy.addDiscountStrategy(voucherDiscountStrategy);
        compositeDiscountStrategy.addDiscountStrategy(generalDiscountStrategy);
        Customer composite = new Customer(compositeDiscountStrategy);
        composite.addItem("cake", 120.0, 2);
        assertEquals(662.0, composite.totalBill(), 0.1);
    }

}