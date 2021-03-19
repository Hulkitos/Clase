package es.hulk.entorns.refactor_ex3;

public class Discount {

    public static double applyDiscount(double price, double discount) {
        double finalPrice;
        float appliedVat;

        switch (Customer.getType()) {
            case Customer.NORMAL:
                appliedVat = 1.21f;
                break;
            case Customer.SPECIAL:
                appliedVat = 1.15f;
                break;
            case Customer.VIP:
                appliedVat = 1.04f;
                break;
            default:
                appliedVat = 1.21f;
                break;
        }

        if (price > 50 && Customer.isVip()) {
            finalPrice = price * 0.5;
        } else if (price > 10 && Customer.isSpecial()) {
            finalPrice = price * 0.1;
        } else {
            finalPrice = price;
        }

        return finalPrice * appliedVat - discount;
    }


}
