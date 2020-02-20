package day41;

// Make this Product a well encapsulated
// make all the instance fields private so it can only be accessible in same class
// provide public getters and setters method

public class Product {

    private String name;
    private double price;

    // this keyword can be used to refer the current object
    // we are working on
    // we can use it to refer the instance field
    // this.fieldName
    // only can be used inside instance method (and later constructor)

    // sag knopka -> Generate -> Getters and Setters  -  awtomat ozi duzedishdiryar

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//    public String getName() {
//        return name;
//    }
//
//    // What if I want to only change the name
//    public void setName(String name) {
//        //name = newName;
//        // this keyword can be used to refer the current object
//        // we are working on
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        if (price > 0) {
//            this.price = price;
//        }
//    }

//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
