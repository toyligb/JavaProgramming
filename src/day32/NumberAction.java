package day32;

public class NumberAction {

    public static void countDownByEvenNumberFrom50To0() {

//        for (int i = 50; i >= 0; i--) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
        countDownByEvenNumberFromXtoY(50, 0);

    }

    public static void countDownByEvenNumberFromXtoY(int x, int y) {

        for (int i = x; i >= y; i --) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        countDownByEvenNumberFrom50To0();
        countDownByEvenNumberFromXtoY(300, 45);

    }

}
