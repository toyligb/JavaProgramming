package day31;

public class Greeting {

    public static void sayHello() {

        System.out.println("Hello Toyly");
    }

    public static void sayHelloTo(String name) {

        System.out.println("Hello " + name);

    }

    public static void main(String[] args) {

        sayHello();
        sayHelloTo("Kids");
        sayHelloTo("B15");

    }

}
