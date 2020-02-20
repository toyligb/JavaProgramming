package zReplit;

import java.util.*;

public class Task129ArraysCopyCertainValues {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("-----EXAMPLE RUN-----");
        String[] numbers = {"zero", "one", "two", "three", "four"};
        System.out.println(Arrays.toString(numbers));

        int count = 0;
        for (String eachItem : numbers) {
            if (eachItem.contains("e")) {
                count++;
            }
        }
        String[] fewValues = new String[count];

        int index = 0;

        for (String eachItem : numbers) {
            if (eachItem.contains("e")) {
                fewValues[index] = eachItem;
                index++;
            }
        }
        System.out.println("fewValues = " + Arrays.toString(fewValues));


    }

}
