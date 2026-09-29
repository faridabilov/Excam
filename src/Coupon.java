import java.time.LocalDate;

public class Coupon {
    private String code;
    private LocalDate expirationDate;
    private int usageLimit;
    private int usedCount;
    private double minimumOrderAmount;
    private Discount discount;

    public Coupon(String code,
                  LocalDate expirationDate,
                  int usageLimit,
                  double minimumOrderAmount,
                  Discount discount) {

        this.code = code;
        this.expirationDate = expirationDate;
        this.usageLimit = usageLimit;
        this.minimumOrderAmount = minimumOrderAmount;
        this.discount = discount;
    }

    public boolean isValid(double orderAmount) {

        if (LocalDate.now().isAfter(expirationDate)) {
            return false;
        }

        if (usedCount >= usageLimit) {
            return false;
        }

        if (orderAmount < minimumOrderAmount) {
            return false;
        }

        return true;
    }

    public double calculateDiscount(double orderAmount) {

        if (!isValid(orderAmount)) {
            return 0;
        }

        return discount.getDiscount(orderAmount);
    }

    public void use() {
        usedCount++;
    }

    public String getCode() {
        return code;
    }
}
