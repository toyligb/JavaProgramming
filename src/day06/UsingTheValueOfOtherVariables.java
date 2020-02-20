package day06;

    import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What do you prefer for drink? : ");
        String yourOrder = scan.next();
        String myOrder = yourOrder;

        System.out.println("Your order is " + yourOrder);
        System.out.println("My order is " + myOrder);

    }

}
