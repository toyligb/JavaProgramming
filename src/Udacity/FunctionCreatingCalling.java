package Udacity;

public class FunctionCreatingCalling {

    public static void kagyzaCykarmak(String shaher) {
        System.out.println("Salam haty!" + shaher);
        System.out.println("Yonekey tekst" + shaher);
    }

    public static void main(String[] args) {

        int x = 5 + 3;
        System.out.println(x);
        kagyzaCykarmak("Ashgabat");

        double randomNumber = Math.random();

        randomNumber *= 6;
        randomNumber += 1;
        int randomInt = (int) randomNumber;

        System.out.println(randomInt);

    }

}
