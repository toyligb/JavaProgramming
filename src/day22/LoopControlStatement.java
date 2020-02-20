package day22;

public class LoopControlStatement {

    public static void main(String[] args) {
                    //012345678901234567890123456789012345678901234567890123456
        String msg = "I struggle with Java, I like Java, Everything is Awesome!";
        int aCount = 0;

        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == 'a' || msg.charAt(i) == 'A') {
                aCount++;
            }
            if (i % 2 == 1) {
                continue;
            }
            if (aCount == 3) {
                break;
            }
            System.out.println(i + " : " + msg.charAt(i));
        }

    }

}
