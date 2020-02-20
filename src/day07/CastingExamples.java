package day07;

    import java.util.Scanner;

public class CastingExamples {

    public static void main(String[] args) {

        int number = (int)(new Scanner(System.in).nextDouble());

        System.out.println(number);

        long numL = 65;
        int numL2 = (int)numL;

        System.out.println(numL2);
        System.out.println((char)numL2);

        int letter1 = 'T';
        int letter2 = 'O';
        int letter3 = 'Y';
        int letter4 = 'L';
        int letter5 = 'Y';

        System.out.println('T' + "  + " + 'O' + "  + " + 'Y' + "  + " + 'L' + "  + " + 'Y');
        System.out.println(letter1 + " + " + letter2 + " + " + letter3 + " + " + letter4 + " + " + letter5);

    }


}
