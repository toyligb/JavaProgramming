package zReplit;

import java.util.*;

public class Task090TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Split:");
        String split = scan.next();
        System.out.print("Number of people:");
        int nPeople = scan.nextInt();
        System.out.print("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.print("Service Quality:");
        String service = scan.next();
        String symbol = "&";
        double totalPay, totalTip, totalPerson, tipPerson;
        int tipPercentage;

        switch (service) {
            case "Poor":
                tipPercentage = 5;
                break;
            case "Fair":
                tipPercentage = 10;
                break;
            case "Good":
                tipPercentage = 15;
                break;
            case "Great":
                tipPercentage = 20;
                break;
            case "Excellent":
                tipPercentage = 25;
                break;
            default:
                tipPercentage = 0;
                break;
        }

        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Number of people entered: " + symbol.repeat(nPeople));
            totalPay = checkAmount + checkAmount * tipPercentage / 100;
            System.out.println("Total to pay: " + totalPay);
            totalTip = checkAmount * tipPercentage / 100;
            System.out.println("Total tip: " + totalTip);
            totalPerson = totalPay / nPeople;
            System.out.println("Total per person: " + totalPerson);
            tipPerson = totalTip / nPeople;
            System.out.println("Tip per person: " + tipPerson);
        } else {
            System.out.println("Number of people entered: " + symbol.repeat(nPeople));
            totalPay = checkAmount + checkAmount * tipPercentage / 100;
            System.out.println("Total to pay: " + totalPay);
            totalTip = checkAmount * tipPercentage / 100;
            System.out.println("Total tip: " + totalTip);
//            totalPerson = totalPay / nPeople;
//            System.out.println("Total per person: " + totalPerson);
//            tipPerson = totalTip / nPeople;
//            System.out.println("Tip per person: " + tipPerson);
        }

    }

}
