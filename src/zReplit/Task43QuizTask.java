package zReplit;

import java.util.*;

public class Task43QuizTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String answer = scan.next();  // c
              // "a"
        switch (answer) {
            case "a" :
                // break;
            case "c" :
                System.out.println(answer + " is wrong answer");
                break;

                case "b" :   // "B"
                System.out.println(answer + " is correct answer");
                break;

            default:
                System.out.println(answer + " invalid answer");
                break;

        }

        if ( answer.equalsIgnoreCase("b")) {
            System.out.println(answer + " is correct answer");
        } else if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("c")) {
            System.out.println(answer + " is wrong answer");
        } else {
            System.out.println(answer + " is invalid");
        }



    }

}
