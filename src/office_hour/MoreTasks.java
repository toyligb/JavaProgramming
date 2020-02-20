package office_hour;

import java.util.*;

public class MoreTasks {

    public static void kmConverter(int km) {
        System.out.println((int) (km * 0.0612));
    }

    public static void gallonConverter(int gallons) {
        System.out.println((int) (gallons * 3.75));
    }

    public static void descendArray1(int[] array) {
        // the sorting is done without the sort method in this version.
        // NO ARRAY METHODS USED !! :)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void descendArray2(int[] array) {
        // this method will directly do the job with a nested loop.
        // can handle duplicates.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    continue;
                }
                if (array[i] > array[j]) {
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void descendArray3(int[] array) {
        // uses sort method.
        Arrays.sort(array);
        // ---------------THIS LOOP ONLY PRINTS IT.
//        for (int i = array.length-1; i >=0 ; i--) {
//            if(i == 0){
//                System.out.print(array[i]);
//                break;
//            }
//            System.out.print(array[i]+", ");
//        }
//        System.out.println();
        // ----------------below will put it in a new array
        // pick one way to do it, up to you :)
        int[] descendingArray = new int[array.length];
        int descendIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            descendingArray[descendIndex] = array[i];
            descendIndex++;
        }
        System.out.println(Arrays.toString(descendingArray));
    }

    public static void calculator(int num1, int num2, char operator) {
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid operator!");
        }
    }

    public static void gradeCalculator(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid Score!");
        } else if (score >= 0 && score <= 59) {
            System.out.println("F");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 90 && score <= 100) {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        kmConverter(500);
        gallonConverter(16);
        descendArray1(new int[]{6, 3, 2, 4, 1, 5});
        descendArray2(new int[]{9, 5, 5, 1, 3, 4});
        descendArray3(new int[]{9, 3, 5, 4, 7, 6});
        calculator(10, 5, '/');
        gradeCalculator(77);

    }

}
