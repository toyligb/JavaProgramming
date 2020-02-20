package zReplit;

import java.util.*;

public class Task175_MethodsWithReturn8_ValidateTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Is there a task to do:");
        boolean notEmpty = scan.nextBoolean();

        System.out.println("Enter next task ID:");
        int taskID = scan.nextInt();

        System.out.println("Enter current task ID:");
        int currentID = scan.nextInt();

        System.out.println(validateTask(notEmpty, taskID, currentID));

    }

    private static boolean validateTask(boolean notEmpty, int taskID, int currentID) {

//        if (notEmpty && taskID == currentID + 1) {
//            return true;
//        }
//        return false;
        return notEmpty && taskID == currentID + 1;
    }

}
