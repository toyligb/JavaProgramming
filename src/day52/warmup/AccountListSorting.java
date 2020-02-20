package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountsList = new ArrayList<>();
        accountsList.add(new Account("John Snow", 10000));
        accountsList.add(new Account("Vlad", 11000));
        accountsList.add(new Account("Svetlana", 13000));
        accountsList.add(new Account("Muhammad", 10000));
        accountsList.add(new Account("Emma", 17000));
        accountsList.add(new Account("Ata", 15000));

        System.out.println("accountsList before sort = " + accountsList);
        Collections.sort(accountsList);
        System.out.println("accountsList after sort = " + accountsList);

        Account myAccount = new Account("Toyly Gurdov", 0);
        for (Account each : accountsList) {
            each.transferAll(myAccount);
        }
        System.out.println("myAccount = " + myAccount);
        System.out.println("accountsList = " + accountsList);

        // What can be the data type of a1
        /*
        * Account a1;
        * Comparable a1;
        * Transferable a1;
        * Object a1
        *
        * An object can be referrred by
        *       it's own type
        *       it's super class type
        *       interface type that it implemented
        *
         */

        Account a1 = new Account("Polymorphism", 10000);
        Transferable t1 = new Account("Polymorphism2", 10000);
        Comparable c1 = new Account("Polymorphism4", 10000);
        Object o1 = new Account("Polymorphism3", 10000);

    }

}
