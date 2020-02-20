package office_hour;

import java.util.Scanner;

public class ConsecutiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        consecutiveNums(N);
    }

    public static void consecutiveNums(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(checkMod(i));
        }
    }

    public static String checkMod(int number) {
        int[] divNumber = new int[]{2, 3, 5};
        String out = "";
        for (int div : divNumber) {
            if (isDiv(number, div)) {
                out += message(div);
            }
        }
        if (!out.equals(""))
            return out;
        else
            return number + "";
    }

    public static boolean isDiv(int num, int div) {
        if (num % div == 0)
            return true;
        else
            return false;
    }

    public static String message(int num) {
        String txt = "";
        switch (num) {
            case 2:
                txt = "Codility";
                break;
            case 3:
                txt = "Test";
                break;
            case 5:
                txt = "Coders";
                break;
        }
        return txt;
    }

}
