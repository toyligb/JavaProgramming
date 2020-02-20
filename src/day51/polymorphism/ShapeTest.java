package day51.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        Shape s4 = new Triangle();
        Shape s5 = new Circle();

//        s1.draw();
//        s2.draw();
//        s3.draw();

        System.out.println("================");
        Shape[] manyShapes = {s1, s2, s3, s4, s5};
        for (Shape each : manyShapes) {
            each.draw();
        }
        System.out.println("----------------------");
//        ArrayList<Shape> allShapes = new ArrayList<>();
//        allShapes.addAll(Arrays.asList(s1, s2, s3, s4));
//        for (Shape eachShape : allShapes) {
//            eachShape.draw();
//        }

    }

}
