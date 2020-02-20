package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println("yourFavNumber = " + yourFavNumber);
        System.out.println("myFavNumber = " + myFavNumber);

        long[] nums = {10, 40, 20};
//        nums[0] = nums[0] * 2;   // nums[0] *= 2;
//        System.out.println(nums[0]);
        // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS *********
        // for each loop does not change item in array
        for (int x = 0; x < 3; x++) {
            nums[x] *= 2;
            System.out.println(nums[x]);
        }

    }
}
