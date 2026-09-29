public class FixedAmountDiscount implements Discount {
    private double amount;

    public FixedAmountDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getDiscount(double price) {
        return Math.min(amount, price);
    }
}
