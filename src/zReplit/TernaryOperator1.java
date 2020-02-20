package zReplit;

import java.util.*;

public class TernaryOperator1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();

        String out = x >= 5 ? x + " is greater than or equal to 5" : x + " is less than 5";

        System.out.println(out);

    }

}
