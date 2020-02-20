package zReplit;

public class Task219_OOP2_LameCalculator {

    public static void main(String[] args) {

        LameCalculator lc = new LameCalculator();
        System.out.println("1+1 = " + lc.plus(1, 1));
        System.out.println("2-3 = " + lc.minus(2, 3));
        System.out.println("2x3 = " + lc.multiply(2, 3));
        System.out.println("10:2 = " + lc.divide(10, 2));

    }

    public static class LameCalculator {

        int x, y;

        public int plus(int x, int y) {
            return x + y;
        }

        public int minus(int x, int y) {
            return x - y;
        }

        public int multiply(int x, int y) {
            return x * y;
        }

        public int divide(int x, int y) {
            return x / y;
        }

    }

}
