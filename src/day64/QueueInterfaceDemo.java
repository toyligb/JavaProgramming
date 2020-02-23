package day64;

import java.util.*;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        // This is the FIRST-IN-FIRST-OUT queue (FIFO)
        // Whichever item comes in first, it will get removed first
        // when we use remove method from the Queue interface
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("Review the class");
        taskQueue.add("Do your homework");
        taskQueue.add("Attend the class");
        taskQueue.add("Say bye to Java");

        System.out.println("taskQueue = " + taskQueue);

        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());

        System.out.println("taskQueue = " + taskQueue);

    }

}
