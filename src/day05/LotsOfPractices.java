package day05;

import java.util.Scanner;

public class LotsOfPractices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    /*
    Task 3 :
    *  Create an interactive program to ask user for day
    *  and generate minute that day have
    * */

        int day, minute;
        System.out.println("This part of the program converts days to minutes.");
        System.out.print("Enter the days: ");
        day = scan.nextInt();
        minute = day * 24 * 60;
        System.out.println(day + " equals to " + minute);

    /*
    Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */

        double hourlyWage, salary;
        System.out.println("\nThis part of the program calculates yearly salary of entered hourly wage.");
        System.out.print("Enter the hourly wage: ");
        hourlyWage = scan.nextDouble();
        salary = hourlyWage * 2080;
        System.out.println("Salary: " + (int)salary);

    /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it
        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>
        Your grand total for this shopping is ????

    * */

        int tCount, pCount, bCount;
        double tPrice, pPrice, bPrice, grandTotal;
        System.out.println("\nThis part of the program is a Grocery Shopping.");

        System.out.print("What is the price of the tomato?: ");
        tPrice = scan.nextDouble();
        System.out.print("How many tomato do you want to buy?: ");
        tCount = scan.nextInt();

        System.out.print("What is the price of the potato?: ");
        pPrice = scan.nextDouble();
        System.out.print("How many potato do you want to buy?: ");
        pCount = scan.nextInt();

        System.out.print("What is the price of the banana?: ");
        bPrice = scan.nextDouble();
        System.out.print("How many banana do you want to buy?: ");
        bCount = scan.nextInt();

        System.out.println("You got " + tCount + " tomato & price is $" + tPrice
                            + " and total >> " + (tCount * tPrice));

        System.out.println("You got " + pCount + " potato & price is $" + pPrice
                + " and total >> " + (pCount * pPrice));

        System.out.println("You got " + bCount + " banana & price is $" + bPrice
                + " and total >> " + (bCount * bPrice));

        grandTotal = tCount * tPrice + pCount * pPrice + bCount * bPrice;

        System.out.println("Your grand total for this shopping is: $" + grandTotal);

        System.out.println("Thank you for shopping in this market!");

    }
}
