package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {

        //
        System.out.println( 5 + 3 ); //8
        System.out.println( 5 - 3 ); //2
        System.out.println( 5 * 3 ); //15
        System.out.println( 5 / 3 ); //1

        //arithmetic operator between two numerical data type
        //the final result will be larger data type
//        System.out.println( 5 + 3.0d ); //8.0
//        System.out.println( 5 - 3.0d ); //2.0
//        System.out.println( 5 * 3.0d ); //15.0
//        System.out.println( 5 / 3.0d ); //1.666666666666667
//        System.out.println( 5 / 3.0f ); //1.6666666

        int a = 5;
        double b = 3.0d;
        float c = 3.0f;

        double result1 = a + b;
        double result2 = a - b;
        double result3 = a * b;
        double result4 = a / b;
        float result5 = a / c;

        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n"
                            + result4 + "\n" + result5);

    }

}
