package day06;

    import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name? : ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.print("What is your age? : ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Your age is " + age);

        System.out.print("What is the address? : ");
        String address = scan.nextLine();
        System.out.print("Your address is " + address);

    }

}
