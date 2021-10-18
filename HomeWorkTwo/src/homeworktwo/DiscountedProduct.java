package homeworktwo;

public class DiscountedProduct extends Product{
    // Original product
    private final Product original;

    // Discount in percent (%)
    private final double discount;

    /**
     * Construct a discounted product
     * @param original
     * @param discount
     */
    public DiscountedProduct(Product original, double discount) {
        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        super(original);
        this.discount=discount;
        this.original=original;

    }

    /**
     * Return the price of this discounted product
     * @param cart shopping cart
     * @return discounted price
     */
    public double getPrice(Cart cart) {
        return original.getPrice(cart)-this.original.getPrice(cart)*(this.discount)/100;
    }

    /**
     * Return the string representation of the product
     * Example: CD [discounted 20 %]
     */
    public String toString() {
        return this.original.getName()+"  uygulanan indirim orani %"+discount+ "";
    }
}
