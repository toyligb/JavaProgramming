package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals {

    @Override
    public void drinkMilk() {
        System.out.println("LION DRINK MILK!!!");
    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAY ROARRRRRR!!!");
    }

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        // any class you created, it can be a data type for a variable
        // also known as reference variable

        Animal a1 = new Lion();
        a1.makeNoise();

        List<Integer> lst = new ArrayList<>();

        Mammals m1 = new Lion();
        m1.drinkMilk();
        m1.makeNoise();

    }

}
