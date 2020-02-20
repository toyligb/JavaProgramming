package day40;

public class SpaceShip {

    String name, currentDirection;
    int xCoordinate, yCoordinate;

    public void setInitialPosition(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    public void setDirection(String newDirection) {

        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {
            currentDirection = newDirection;
        } else {
            System.out.println("Invalid direction!");
            currentDirection = "";
        }

    }

    public void move1Block() {
        switch (currentDirection.toUpperCase()) {
            case "UP":
                yCoordinate++;
                break;
            case "DOWN":
                yCoordinate--;
                break;
            case "RIGHT":
                xCoordinate++;
                break;
            case "LEFT":
                xCoordinate--;
                break;
            default:
                System.out.println("Position not changed!");
        }
    }

    public void move1Block(String newDirection) {

        setDirection(newDirection);
        move1Block();

    }

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
