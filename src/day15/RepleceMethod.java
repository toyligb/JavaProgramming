package day15;

public class RepleceMethod {

    public static void main(String[] args) {

        String message = "I love Pumpkin, Pumpkin is FUN!";

        String firstWord = message.replaceFirst("Pumpkin", "Java");
        System.out.println("firstWord = " + firstWord);
        String newMessage = message.replace("Pumpkin", "Java");
        System.out.println("newMessage = " + newMessage);

        String message2 = "Happy Thanks Giving to ALL!!!";
        // replace space from everywhere
        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println("message2 = " + message2);
        message2 = message2.replace("!!", "!");
        System.out.println("message2 = " + message2);
        message2 = message2.replace(" ", "");
        System.out.println("message2 = " + message2);

    }

}
