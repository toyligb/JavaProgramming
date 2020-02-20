package day42;

public class Movie {

    private String name;
    private double length;
    private String type;

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Write a constructor to set all the fields value

    // default constructor: is a constructor that will be given by compiler
    // only if you don't have any in your class
    // it's invisible
    // and it has no parameter
    // it has no code inside

    public Movie() {
        System.out.println("EMPTY MOVIE");
    }

    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
