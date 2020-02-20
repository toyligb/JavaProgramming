package day26;

import java.util.*;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda",
                "Captain Marvel", "Captain America"};

        System.out.println("Marvel Heroes: " + Arrays.toString(marvelHeroes));

        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Iron Man";
        int countOfItem = 0;

        for (String eachHero : marvelHeroes) {
            if (eachHero == itemToSearch) {
                countOfItem++;
            }
        }
        System.out.println("count Iron Man = " + countOfItem);

        int countBlack = 0;

        for (String eachWord : marvelHeroes) {
            if (eachWord.contains("Black")) {
                countBlack++;
            }
        }
        System.out.println("countBlack = " + countBlack);

    }

}
