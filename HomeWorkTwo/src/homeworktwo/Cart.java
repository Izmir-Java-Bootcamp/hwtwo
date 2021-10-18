package homeworktwo;

import java.util.ArrayList;
import java.util.List;

public class Cart {// list of products
    private final List<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }

    /**
     * Return the list of products
     * @return
     */
    public List<Product> getProducts(){
        // code here
        return this.products;
    }

    /**
     * Add a product to the list
     * @param product
     */
    public void addProduct(Product product) {
        // code here
        this.products.add(product);
    }

    /**
     * Add an list of products to the list
     *  @param products
     */
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    /**
     * Adds a product several times
     * @param product
     * @param howManyTimes number of times to add product
     */
    public void addProduct(Product product, int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            this.products.add(product);
        }
    }

    /**
     * Calculate the total price
     * @return
     */
    public double totalPrice(){
        double totalPrice=0;
        for (Product p : this.products) {
            totalPrice+=p.getPrice(this);
        }
        return totalPrice;
    }


    /**
     * String representation of products in a shopping cart
     * Example:
     * CD of Teoman 22.50 TL. Sold by Berk
     * TV [discounted by 20.00%] 4000.00 TL. Sold by Merve
     */
    public String toString() {
        String result = "";

        return result;
    }
}
