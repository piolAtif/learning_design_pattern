package strategyPattern;

public class PrintBill {
    public static void main(String[] args) {
        DiscountStrategy generalDiscountStrategy= new GeneralDiscountStrategy();
        Customer general = new Customer(generalDiscountStrategy);
        general.add("cake", 120.0, 2);
        System.out.println(general.totalPrice());

        DiscountStrategy loyalDiscountStrategy= new LoyalDiscountStrategy();
        Customer loyal = new Customer(loyalDiscountStrategy);
        loyal.add("cake", 120.0, 2);
        System.out.println(loyal.totalPrice());

        DiscountStrategy voucherDiscountStrategy= new VoucherDiscountStrategy();
        Customer voucher = new Customer(voucherDiscountStrategy);
        voucher.add("cake", 120.0, 2);
        System.out.println(voucher.totalPrice());

        CompositeDiscountStrategy compositeDiscountStrategy = new CompositeDiscountStrategy();
        compositeDiscountStrategy.addDiscountStrategy(loyalDiscountStrategy);
        compositeDiscountStrategy.addDiscountStrategy(voucherDiscountStrategy);
        Customer composite = new Customer(compositeDiscountStrategy);
        composite.add("cake",120.0,2);
        System.out.println(composite.totalPrice());




    }

}
