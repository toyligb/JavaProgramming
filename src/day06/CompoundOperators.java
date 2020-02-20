package day06;

    import java.util.Scanner;

public class CompoundOperators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        System.out.print("What number do you want to use? : ");
        int num2 = scan.nextInt();

        num += num2;
        System.out.println("Adding " + num2 + " = " + num);

        num -= num2;
        System.out.println("Subtracting " + num2 + " = " + num);

        num *= num2;
        System.out.println("Multiply " + num2 + " = " + num);

        num /= num2;
        System.out.println("Dividing " + num2 + " = " + num);

        num %= num2;
        System.out.println("Remainder of " + num2 + " = " + num);

    }

}
