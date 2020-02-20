package day12;

public class StackHeapTraining {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";

        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println(a == b); // true
        System.out.println(c == d); // false
        System.out.println(a == c); // false
        System.out.println(a.equals(b)); // true
        System.out.println(c.equals(d)); // true
        System.out.println(a.equals(c)); // true
        System.out.println(a.equals("Hello")); // true

    }

}
