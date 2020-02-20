package day51.polymorphism;

import day50.Shape;
import day50.Square;

public class ShapeAreaCalculation {

    public static void main(String[] args) {
        Shape s1 = new Square("square 1", 5);
        Shape s2 = new Square("square 2", 10);
        Shape s3 = new Square("square 2", 21);
        Shape s4 = new Square("square 2", 15);
        Shape s5 = new Square("square 2", 9);
        Shape[] shapeArr = {s1, s2, s3, s4, s5};
        for (Shape each : shapeArr) {
            each.calculateArea();
            System.out.println(each);
        }
    }

}
