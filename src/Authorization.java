public class Authorization {
    private User user;

    public Authorization(User user) {
        this.user = user;
    }

    public boolean canManageProduct(){
        return this.user instanceof Admin;
    }
    public boolean canCreateOrder() {
        return this.user instanceof Customer;
    }
    public boolean canManageOrder() {
        return this.user instanceof Admin;
    }
    public boolean canUseCart() {
        return this.user instanceof Customer;
    }
    public boolean canCreateCoupon() {
        return this.user instanceof Admin;
    }
}
