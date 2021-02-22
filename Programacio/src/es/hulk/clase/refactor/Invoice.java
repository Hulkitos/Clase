package es.hulk.clase.refactor;

public class Invoice {
    public float totalPrice (float price, float vat, float discount) {
        float implVat = (vat * price) / 100;
        System.out.println("Applied vat: " + implVat);

        implVat = price + implVat;
        System.out.println("Total with vat: " + implVat);

        return implVat - discount;
    }
}
