package day11;

public class ForPractice {

    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        for (x = 1; x <= 10; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
