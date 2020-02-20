package day52.polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {

        //Circle s1 = new Circle("Penny", 5);
        Shape s1 = new Circle("Penny", 5);
        //Object s1 = new Circle("Penny", 5);
        //Drawable s1 = new Circle("Penny", 5);
        Shape s2 = new Rectangle("Book", 10, 5);
        printAnyShapeArea(s2);

        printAnyShapeArea(new Square("Bob", 6));

        // ONLY THE REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABLE
        //s1.draw();
        //s1.draw();
        printAnyShapeArea(s1);
        System.out.println(s1.toString());

        // How do I know what is the actual object type
        System.out.println(s1.getClass().getSimpleName());

        drawShape3Times(s1);
        drawShape3Times(s2);
        drawShape3Times(new Square("Book", 10));

    }
    // Create a static method called drawShape3Times
    // it has Shape as parameter
    // return nothing
    // it will draw the shape 3 times
    public static void drawShape3Times(Shape anyShape) {
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();
    }

    // Create a method that accepts any Shape and print out the calculated area
    public static void printAnyShapeArea(Shape anyShape) {
        anyShape.calculateArea();
        System.out.println(anyShape.name + "'s area is = " + anyShape.area);
    }

}
