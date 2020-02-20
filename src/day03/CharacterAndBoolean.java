package day03;

public class CharacterAndBoolean {

    public static void main(String[] args) {

        char grade = 'A';
        char emailSign = '@';

        System.out.println("My score for Math is " + grade + ".");
        System.out.println("My email is toyligb" + emailSign + "gmail.com");
        System.out.println("Email sign is " + (char)64);

        boolean isLightOn = true;
        System.out.println("Did you turn off the light? : " + isLightOn);
        isLightOn = false;
        System.out.println("Did you turn off the light? : " + isLightOn);

        boolean areYouSleeping = false;
        System.out.println("Are you sleeping: " + areYouSleeping);

        System.out.println(10<15); //goni true ya-da false alyp bolyar

    }

}
