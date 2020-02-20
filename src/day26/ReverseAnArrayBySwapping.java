package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {
                               //   0  1  2   3  4  5   6   7  8  9   indexleri
        int[] myNumbers = new int[]{5, 3, 21, 2, 1, 13, 8, -4, 7, 14};
        int size = myNumbers.length;
        int lastIndex = size - 1;
        int middleIndex = size / 2;

        System.out.println("Before swap --->>> " + Arrays.toString(myNumbers));

//        System.out.println( myNumbers[0] + " --- " + myNumbers[lastIndex - 0]);
//        System.out.println( myNumbers[1] + " --- " + myNumbers[lastIndex - 1]);
//        System.out.println( myNumbers[2] + " --- " + myNumbers[lastIndex - 2]);

        System.out.println("====looped version====");
        //loop this
        for (int i = 0; i <= middleIndex; i++) {
            //System.out.println( myNumbers[i] + " --- " + myNumbers[lastIndex - i]);
            int temp = myNumbers[i];
            myNumbers[i] = myNumbers[lastIndex - i];
            myNumbers[lastIndex - i] = temp;
        }
        System.out.println("After swap --->>> " + Arrays.toString(myNumbers));

    }
}
