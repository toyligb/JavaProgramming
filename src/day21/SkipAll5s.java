package day21;

public class SkipAll5s {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i%5 == 0) {
                System.out.println("SKIPPING " + i);
                continue;
            }
            System.out.println(i);
        }

    }

}
