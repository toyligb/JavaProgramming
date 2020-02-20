package day09;

import java.util.Scanner;

public class GreetingsSelection2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int languageOption;
        String greeting = "";
        System.out.println("Welcome to Cybertek!");
        System.out.print("Choose language from 1-7: ");
        languageOption = scan.nextInt();

        switch (languageOption) {
            case 1 : greeting = "Hello";
                break;
            case 2 : greeting = "Salam";
                break;
            case 3 : greeting = "Hola";
                break;
            case 4 : greeting = "Merhaba";
                break;
            case 5 : greeting = "Привет";
                break;
            case 6 : greeting = "Szia";
                break;
            case 7 : greeting = "Bonjour";
                break;
            default: greeting = "CyberTek";
                break;
        }
        System.out.println(greeting + " SDET!");
    }
}
