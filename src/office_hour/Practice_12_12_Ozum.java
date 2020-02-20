package office_hour;

import java.util.*;

public class Practice_12_12_Ozum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        int[] numbs = {1, 1, 2, 3, 4};
//
//        for (int i = 0; i < numbs.length; i++) {
//            int count = 0;
//            for (int j = 0; j < numbs.length; j++) {
//                if (numbs[i] == numbs[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println("unique = " + numbs[i]);
//            }
//
//        }

        System.out.println("===================");

        int num1 = 6;
        int num2 = 3;
        int countOfSubtraction = 0;
        int result = 0;

        for (int i = num1; i > 0; i-=num2) {
            result = num1 - num2;
            num1 = result;
            countOfSubtraction++;
        }
        System.out.println("countOfSubtraction = " + countOfSubtraction);

    }

}
