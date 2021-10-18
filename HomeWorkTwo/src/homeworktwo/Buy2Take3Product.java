package homeworktwo;

public class Buy2Take3Product extends Product{
    //original product
    private final Product original;

    /**
     * Construct a Buy2Take3 product
     * If the price of this product can not be reduced
     * you should print a message to the user and terminate the
     * program
     * @param original
     */
    public Buy2Take3Product(Product original) {
        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        // code here

        super(original);

    /*	if(canBeReduced()) {
    		throw new IllegalArgumentException("You cannot discount if you pay 2 take 3");
    	}*/
        this.original = original;
    }

    /**
     * Return false if the product price can not be
     * reduced
     * @return
     */
    public boolean canBeReduced() {
        // You can not discount the price of Buy2Take3 product
        // code here
        return !(this.original instanceof DiscountedProduct);
    }

    /**
     * Return the unit price of a product using the
     * formula "Buy2Take3"
     * @param cart shopping cart
     * @return unit price
     */
    public double getPrice(Cart cart) {
        // calculate unit price of this product purchased
        // as Buy2Take3
        // code here
        long buy2Take3Count = cart.getProducts().stream().filter(it -> it instanceof Buy2Take3Product).count() / 3;
        if (buy2Take3Count > 0) {
            return this.original.getPrice(cart) * (0.66);
        }
        return this.original.getPrice(cart);
    }

}
