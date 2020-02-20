package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        int[] arr = {4, 3, 8, 10, -4, 7, 9};
        int sum = 0;
        int lastItem = arr[arr.length-1];

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("middle: " + arr[arr.length / 2]);
        System.out.println("last " + lastItem);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * 2);
        }
    }
}
