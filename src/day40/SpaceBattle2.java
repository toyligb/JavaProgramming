package day40;

public class SpaceBattle2 {

    public static void main(String[] args) {
        SpaceShip2 s1 = new SpaceShip2();
        s1.name = "Orville";

        s1.setInitialPosition(1, 5);
        s1.setDirection("ABC");
        s1.move1Block();
        System.out.println("s1 " + s1);

        s1.setDirection("ABC");
        s1.move1Block();

        System.out.println("s1 " + s1);
//        // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
//        s1.setDirection("ABC");
//        s1.move1Block();
//        System.out.println("s1 " + s1);
//        // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
//        s1.setDirection("ABC");
//        s1.move1Block();
//        System.out.println("s1 " + s1);
//
//        s1.setDirection("down");
//        s1.move1Block();
//        System.out.println("s1 " + s1);
        s1.move1Block("up");
        s1.move1Block("right");
        s1.move1Block("up");
        s1.move1Block("down");
        s1.move1Block("HOME");

        System.out.println("s1 = " + s1);


    }

}
