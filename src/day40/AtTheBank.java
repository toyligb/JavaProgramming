package day40;

import java.util.*;

public class AtTheBank {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.setAllTheValue("Saving", "Jemal",
                123654789, 100000);

        b1.showAccountBalance();

        b1.showAccountHolderType();

        b1.deposit(15000);
        System.out.println("b1 = " + b1);

        b1.withdraw(36000);
        System.out.println("b1 = " + b1);

        b1.withdraw$100Cash();
        System.out.println("b1 = " + b1);

        b1.purchaseProduct(120, 3);
        System.out.println("b1 = " + b1);

    }

}
