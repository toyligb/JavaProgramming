package day09;

import java.util.Scanner;

public class GreetingsSelection {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int languageOption = 1;
        String greeting = "";

        System.out.print("Pick the language number: ");
        languageOption = scan.nextInt();

        if(languageOption == 1) {
            greeting = "Hello";
        } else if(languageOption == 2) {
            greeting = "Salam";
        } else if(languageOption == 3) {
            greeting = "Hola";
        } else if(languageOption == 4) {
            greeting = "Merhaba";
        } else if(languageOption == 5) {
            greeting = "Привет";
        } else if(languageOption == 6) {
            greeting = "Szia";
        } else if(languageOption == 7) {
            greeting = "Bonjour";
        } else {
            greeting = "CyberTek";
        }
        System.out.println(greeting + " SDET!");
    }
}
