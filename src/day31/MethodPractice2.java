package day31;

public class MethodPractice2 {

    public static void countDownFrom20TillOne() {

        for (int i = 20; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void printOddNumbersFrom1To100() {

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    public static void nameSpeller() {

        String name = "Toyly";
        for (int i = 0; i < name.length() - 1; i++) {
            System.out.print(name.charAt(i) + " - ");
        }

    }

    public static void main(String[] args) {

        countDownFrom20TillOne();

        printOddNumbersFrom1To100();

        nameSpeller();

    }

}
