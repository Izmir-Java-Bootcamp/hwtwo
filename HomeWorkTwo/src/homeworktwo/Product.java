package homeworktwo;

public class Product {
    private final String seller;
    private final String name;
    private final double price;

    /**
     * Construct a new Product given the following parameters
     * @param seller
     * @param name
     * @param price
     */
    public Product(String seller, String name, double price) {
        this.seller = seller;
        this.name = name;
        this.price = price;
    }

    /**
     * Construct a new Product from a given product
     * @param original
     */
    public Product(Product original) {
        this.seller = original.seller;
        this.name = original.name;
        this.price = original.price;
    }

    /**
     * Return the seller of this product
     * @return seller
     */
    public final String getSeller() {
        return seller;
    }

    /**
     * Return the name of this product
     * @return name
     */
    public final String getName() {
        return name;
    }

    /**
     * Return the price of this product
     * @param cart
     * @return price
     */
    public double getPrice(Cart cart) {
        return price;
    }

    /**
     * Returns true if the price of this product
     * can be reduced
     * @return
     */
    public boolean canBeReduced() {
        return true;
    }

    /**
     * Return the name of the product
     */
    public String toString() {
        return name+", Seller: "+seller+", Price: "+price;
    }
}
