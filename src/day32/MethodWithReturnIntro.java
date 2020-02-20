package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name = giveMeMyName();
        System.out.println("name = " + name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        System.out.println(doubleTheNumber(20));

        System.out.println(add2Numbers(8, 91));

    }

    // I want to create a static method called giveMeMyName
    // It just returns your name as a result
    public static String giveMeMyName() {

        String myName = "Toyly";
        return myName;   // return "Toyly";

    }

    public static int doubleTheNumber(int num) {

        int result = num * 2;
        return result;

    }

    public static int add2Numbers(int x, int y) {

        int result = x + y;
        return result; // return x + y;

    }


}
