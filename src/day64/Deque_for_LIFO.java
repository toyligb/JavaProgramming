package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        // How do we implement a LifoQueue if not using old class called Stack
        // we can use any of Deque interface implementation
        // Deque is a double ended Queue so we can add item as always
        // and when we remove we can use removeLast last method to achieve Last In First Out

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("Review the class");
        lifoQue.add("Do your homework");
        lifoQue.add("Attend the class");
        lifoQue.add("Say bye to Java");

        System.out.println("lifoQue = " + lifoQue);

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());

    }

}
