package day43;

/**
 * A Blueprint for Coffee object
 * With 3 constructors
 * getters and setters
 * Price should never be less than 0
 * No Coffee object with minus price should be created
 * No one should change the price
 * to minus for any existing coffee object
 */

public class Coffee {

    private String type;
    private int caffeineLevel;
    private double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price > 0) ? price : 1;
    }

    public Coffee() {
        System.out.println("No arguments constructor");
    }

    public Coffee(String type, int caffeineLevel) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        System.out.println("2 args constructor being called");
    }

    public Coffee(String type, int caffeineLevel, double price) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        setPrice(price);
        System.out.println("3 args constructor being called");
    }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
