package day31;

public class MyFirstMethod {

    public static void FirstMethod() {

        System.out.println("START OF MY JAVA ADVENTURE.");
        System.out.println("HELLO WORLD.");
        System.out.println("MY NAME IS TOYLY.");

    }

    public static void MathOperators() {

        int num1 = 7;
        int num2 = 3;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        float result4 = num1 / num2;
        double result5 = num1 / num2;
        int result6 = num1 % num2;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);

    }

    public static void main(String[] args) {

        FirstMethod();

        System.out.println("===============");

        MyFirstMethod.MathOperators();

        System.out.println("===========================");
        MethodsIntro.sayHello();

        System.out.println("===============");

        MethodPractice.count1To10();

        MethodPractice.count1To10();

    }

}
