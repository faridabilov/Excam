public class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double getDiscount(double price) {
        return price * percentage / 100;
    }
}
