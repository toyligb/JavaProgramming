package day48;

public class HR_Action {

    public static void main(String[] args) {

        // Employee e1 = new Employee(); -->> abstract'y uytgedip bolmayar

        HourlyEmployee e1 = new HourlyEmployee("Toyly", 7, 55, 2500);
        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee("Beza", 100, 55, 2000);
        e2.calculateAnnualSalary();
        System.out.println("e2 = " + e2);

        FullTimeEmployee e3 = new FullTimeEmployee("Toyly", 102, 10000);
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee("Denis", 120, 13000);
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);

        // each and every class we create, it will become a data type (reference type)

    }

}
