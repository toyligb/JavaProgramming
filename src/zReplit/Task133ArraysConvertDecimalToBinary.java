package zReplit;

import java.util.*;

public class Task133ArraysConvertDecimalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        for (int i = binary.length-1; i >= 0; i--) {
            binary[i] = decimal % 2;
            decimal /= 2;
        }

        System.out.println(Arrays.toString(binary));

    }

}
