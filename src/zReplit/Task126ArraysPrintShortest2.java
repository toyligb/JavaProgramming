package zReplit;

import java.util.*;

public class Task126ArraysPrintShortest2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //str.replace(" ", "");

        String[] arr = str.split(", ");

        System.out.println(Arrays.toString(arr));

        // find shortest word
        String shortestWord = arr[0];

        for (String eachWord : arr) {
            if (eachWord.length() < shortestWord.length()) {
                shortestWord = eachWord;
            }
        }

        // find how many words have length of shortest word
        int count = 0;
        for (String eachWord : arr) {
            if (eachWord.length() == shortestWord.length()) {
                count++;
            }
        }

        String[] shortlar = new String[count];

        int index = 0;

        for (String eachWord : arr) {
            if (eachWord.length() == shortestWord.length()) {
                shortlar[index] = eachWord;
                index++;
            }
        }
        Arrays.sort(shortlar);
        System.out.println(Arrays.toString(shortlar));

//        int shortLength = arr[0].length();
//        String shortWord = arr[0];
//        String allShorts = "";
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() < shortLength && !shortWord.equals(arr[i])) {
//                //shortWord = arr[i];
//                allShorts += arr[i] + ",";
//            }
//        }
//
//        arr = allShorts.split(",");
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));


    }
}
