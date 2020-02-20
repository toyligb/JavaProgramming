package zReplit;

public class Task150_Methods5_SimplePrintPattern {

    public static void printHollowRect() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printHollowRect();

    }

}
