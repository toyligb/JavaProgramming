package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {

    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
//        System.out.println(s1.allProducts);

//        s1.allProducts.add(new Product("iPad Pro", 349));
//        System.out.println(s1.allProducts);

        List<Product> shaCoffee = Arrays.asList(new Product("Americano", 5),
                new Product("Latte", 7), new Product("Mocha", 6));
        Store s2 = new Store("Sha Coffee", shaCoffee);
        System.out.println("s2 = " + s2);



    }

}
