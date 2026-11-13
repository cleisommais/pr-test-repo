package demo;

public final class Checkout {
    private Checkout() {}

    public static int totalInCents(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be nonnegative");
        }
        return PriceCatalog.unitPriceInCents() * quantity;
    }
}
