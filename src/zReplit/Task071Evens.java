package zReplit;

import java.util.*;

public class Task071Evens {

    public static void main(String[] args) {

        int x = 0;
        while (x <= 100) {
            x++;
            if (x % 2 == 0) {
                System.out.print(x + ", ");
            }
        }

    }

}
