package day40;

import java.util.*;

public class SpaceGame {

    public static void main(String[] args) {

        SpaceShip ship1 = new SpaceShip();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your ships name:");
        ship1.name = scan.next();

        System.out.println("Enter your current x coordinate:");
        int x = scan.nextInt();

        System.out.println("Enter your current y coordinate:");
        int y = scan.nextInt();

        ship1.setInitialPosition(x, y);

        String answer = "";
        System.out.println("Do you want to move your ship:");
        answer = scan.next();
        while (answer.equalsIgnoreCase("YES")) {
            System.out.println("Which way do you want to move (UP, DOWN, RIGHT, LEFT):");
            ship1.setDirection(scan.next());
            ship1.move1Block();
            System.out.println("Your ships new coordinates:");
            System.out.println(ship1);
            System.out.println("Do you want to move your ship:");
            answer = scan.next();
        }
        ;

    }

}
