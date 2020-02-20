package day11;

import java.util.*;

public class Switch_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String lightRoom = "";
        System.out.println("Rooms are: 1-Bd, 2-Lr, 3-Ki, 4-Ka");
        System.out.println("Which light do you want to turn on: ");
        int roomNo = scan.nextInt();

        switch (roomNo) {
            case 1:
                lightRoom = "Bedroom";
                break;
            case 2:
                lightRoom = "Living room";
                break;
            case 3:
                lightRoom = "Kitchen";
                break;
            case 4:
                lightRoom = "Hallway";
                break;
            default:
                lightRoom = "No such room";
                break;

        }

        System.out.println("The light is turned on in " + lightRoom);

    }

}
