package day56;

import java.util.ArrayList;
import java.util.List;

// How does contains decide you have an object you are looking for in your list?
// it will call .equals method of that type, if it's overridden to check for content
// then it will return desired result according to the content (attributes)
// else it will always return false

// same thing for remove ? how can i remove an item from the list using remove method that accept object ?
// first it decide whether you have that object or not by checking using contain method .
// if you have it then you remove ,  if contains return false you can not remove because
// we cant remove what we don't have

public class ProductListPractice {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Sony TV", 499));
        productList.add(new Product("Macbook Pro", 2999));
        productList.add(new Product("Macbook Air", 1299));
        productList.add(new Product("iPhone X", 999));
        productList.add(new Product("iPhone XL", 1299));
        productList.add(new Product("Samsung Note 10", 1349));
        productList.add(new Product("Dell Optiplex 3070", 599));

        System.out.println("productList.size() = " + productList.size());

        // check whether we have Sony TV, with price 499
//        boolean result = false;
//        for (Product each : productList) {
//            if (each.getName().equals("Sony TV") && each.getPrice() == 499) {
//                result = true;
//            }
//            if (each.equals(new Product("Sony TV", 499))) {
//                result = true;
//            }
//        }
        // How does contains method decide whether the list contains the object we are looking for?
        // it will internally call the equals method of that type (Product here)
        // if it return true then contains method will return true if not, return false
        Product sony = new Product("Sony TV", 499);
        boolean result = productList.contains(sony);
        System.out.println("Has Sony TV with price 499 result = " + result);
        System.out.println("sony = " + productList.indexOf(sony));

        boolean result2 = productList.contains(new Product("Apple TV", 1379));
        System.out.println("Has Apple TV with price 1379 result2 = " + result2);

        productList.remove(sony);
        System.out.println("productList = " + productList.contains(sony));
        System.out.println(productList.size());
        System.out.println("productList = " + productList.indexOf(sony));

    }

}
