package office_hour;

public class Practice_12_05_01 {

    public static void main(String[] args) {

        int i = 0, sum = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of the even numbers between 0-20 is = " + sum);
    }
}
