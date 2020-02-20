package day11;

public class StringEquality {

    public static void main(String[] args) {

        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';

        System.out.println("is c1 equal to c2");
        System.out.println(c1 == c2);

        System.out.println("is c1 is equal to c3");
        System.out.println(c1 == c3);

        String name = "Toyly";  // String literal

        String name2 = new String("Toyly");

        String name3 = "Toyly";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name2)); // gives true
        System.out.println(name.equals(name3));

    }

}
