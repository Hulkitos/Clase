package es.hulk.clase.refactor;

public class Customer {

    private static boolean isVip;
    private static boolean isSpecial;
    private static int type;

    public static final int NORMAL = 0;
    public static final int SPECIAL = 1;
    public static final int VIP = 2;

    public Customer(boolean isVip, boolean isSpecial, int type) {
        this.isVip = isVip;
        this.isSpecial = isSpecial;
        this.type = type;
    }

    public double applyDiscount(double price, double discount) {
        return Discount.applyDiscount(price, discount);
    }

    public static int getType() {
        return type;
    }

    public static boolean isVip() {
        return isVip;
    }

    public static boolean isSpecial() {
        return isSpecial;
    }
}
