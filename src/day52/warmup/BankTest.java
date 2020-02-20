package day52.warmup;

import day52.warmup.Account;

public class BankTest {

    public static void main(String[] args) {

        Account a1 = new Account("Recep Ecer", 10000);
        Account a2 = new Account("Arya Stark", 7000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after = " + a1);
        System.out.println("a2 after = " + a2);

        System.out.println("Account 1 name " + a1.name + " isPalindrome? : " + a1.isPalindrome());
        System.out.println("Account 2 name " + a2.name + " isPalindrome? : " + a2.isPalindrome());

        System.out.println("=============");
        a2.transferAmount(a1, 5000);
        System.out.println(a1);
        System.out.println(a2);

    }

}
