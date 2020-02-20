package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {

    public static void main(String[] args) {

        List<Product> shaCoffee = Arrays.asList(new Product("Americano", 5),
                new Product("Latte", 7), new Product("Mocha", 6));
        Store s2 = new Store("Sha Coffee", shaCoffee);
        System.out.println("s2 = " + s2);

        Product p1 = new Product("CheeseCake", 10);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);

        s2.addProduct("Water", 1);
        System.out.println("s2 = " + s2);

        System.out.println("s2 product count = " + s2.getProductCount());

        s2.displayProducts();

        System.out.println("CheeseCake 10 = " + s2.checkIfProductExists(p1));

    }

}
