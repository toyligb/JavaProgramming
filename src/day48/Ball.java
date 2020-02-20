package day48;

public class Ball implements Bouncible {

    String shape;
    String color;

    public Ball(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public void bounce() {
        System.out.println("This " + shape + " and " + color +
                " ball is bouncing if gravity is " + GRAVITY);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
