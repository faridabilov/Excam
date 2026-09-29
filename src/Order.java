import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<OrderItem> items;
    private Address address;
    private Coupon coupon;
    private OrderStatus status;

    public Order(int id,
                 Customer customer,
                 List<OrderItem> items,
                 Address address,
                 Coupon coupon) {

        this.id = id;
        this.customer = customer;
        this.items = items;
        this.address = address;
        this.coupon = coupon;
        this.status = OrderStatus.PENDING;
    }

    public void nextStatus() {

        switch (status) {
            case PENDING:
                status = OrderStatus.PAID;
                break;

            case PAID:
                status = OrderStatus.SHIPPED;
                break;

            case SHIPPED:
                status = OrderStatus.DELIVERED;
                break;

            case DELIVERED:
                throw new IllegalStateException(
                        "Order artıq DELIVERED statusundadır."
                );
        }
    }

    public void cancel() {

        if (status == OrderStatus.SHIPPED ||
                status == OrderStatus.DELIVERED) {

            throw new IllegalStateException(
                    "SHIPPED və DELIVERED statusunda Order ləğv edilə bilməz."
            );
        }

    }

    public OrderStatus getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Address getAddress() {
        return address;
    }

    public Coupon getCoupon() {
        return coupon;
    }
}
