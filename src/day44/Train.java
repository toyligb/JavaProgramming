package day44;

// what is inherited from Super class?
// fields and methods that visible to the Sub class are inherited
// constructors are not inherited
// A class can only have 1 Super class *****
// A class can have infinite number of Sub classes *****

public class Train extends Vehicle {

    int wagonCount;

    public void makeChoChoSound() {
        System.out.println("CHOOO CHOOO");
    }

    public static void main(String[] args) {

        Train t1 = new Train();
        t1.makeChoChoSound();
        // these attributes we got from Vehicle class
        t1.make = "Thomas";
        t1.setYear(1999);
        System.out.println(t1.getYear());
        // calling the method we got from Vehicle
        t1.start();
        t1.goForward();

    }

}
