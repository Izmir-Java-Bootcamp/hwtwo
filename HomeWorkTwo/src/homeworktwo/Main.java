package homeworktwo;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("____________________________");
        System.out.println("WELCOME TO KODLUYORUZ SHOP ! ");
        System.out.println("____________________________");
        System.out.println("What is your name ? : ");
        String userName = scanner.nextLine();

        System.out.println("Hİ " + userName + ". Please choose one of the options below...\n");

        Cart cart = new Cart();
        askCustomer(cart);

    }
    /**
     * This is the main class for the application, interacting
     * with the customer, adding to the cart different products to
     * be purchased and finally calculating the total amount to be paid
     */

    /**
     * Allows a cashier to enter the details for a product
     * to be purchased by a customer
     * @param cart the shopping cart of a given customer
     */
    public static void askCustomer(Cart cart){
        // Code to read from console the product name, seller,
        // price, number of products, discount and
        // if Buy2Take3 applies.
        // Then create a product of the correct type
        // and add it to the shopping cart


        while(true){
            System.out.println("Enter 1 to buy a product: ");
            System.out.println("Enter 0 to checkout and proceed with the payment: ");

            int select = scanner.nextInt();

            if (select == 0){
                String result;
                for (Product product : cart.getProducts()){
                    result = "Product name : " + product.getName() + "\n"
                            +"Price : " + product.getPrice(cart) + "\n"
                            +"Sold by : " + product.getSeller();
                    System.out.println(result);
                }
                System.out.println("TOTAL PRICE : " + cart.totalPrice());
            }else if(select != 0 && select != 1){
                System.out.println("You entered a wrong number , please try again ! ");
                System.exit(0);
            }

            System.out.println("Product name: ");
            String productName = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Seller name: ");
            String seller = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            Product product = new Product(seller,productName,price);

            System.out.println("Enter Quantity : ");
            int quantity = scanner.nextInt();
            System.out.println("Discount (enter 0 if no discount applies): ");
            double discountAmount = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Does Buy2Take3 apply Y/N: ");
            String buy2Take3Select = scanner.nextLine();

            if (discountAmount != 0 && buy2Take3Select.equalsIgnoreCase("y")){
                System.out.println("You can't apply both discounts on same product");
                System.exit(0);
            }

            if (product.canBeReduced() && discountAmount != 0){
                DiscountedProduct discountedProduct = new DiscountedProduct(product,discountAmount);
                cart.addProduct(discountedProduct,quantity);
            }
            else{
                Buy2Take3Product buy2Take3Product = new Buy2Take3Product(product);
                cart.addProduct(buy2Take3Product,quantity);
            }

        }
    }


}
