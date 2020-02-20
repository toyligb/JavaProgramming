package day48;
/*
Warm up
        ----------
abstract super class called Employee
        instance fields : name , id
        Constructor : to set all the fields
abstract methods :
        calculateAnnualSalary
        toString
        HourlyEmployee
        instance fields :
        hourlyWage , numsOfHours ,
        Constructor : to set all the fields
        instance methods ;
        calculateAnnualSalary
        toString
        ----------------
        FullTimeEmployee
        instance fields :
        monthlySalary
        Constructor : to set all the fields
        instance methods ;
        calculateAnnualSalary
        toString
*/
public abstract class Employee {

    String name;
    int id;

    public Employee(){ // beyleki klasslarda kody yazyp gutarmankan
                        // error bermez yali bosh method goshulyar
    }

    // we will add constructors to set all the fields.
    // Because we don't want to do it one by one.

    // Why do we have constructor here
    // We can not create an object out of it?
    // What is the point?
    // So that sub class can reuse the code of setting id and

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void calculateAnnualSalary();

    // This is optional: the only reason we put it in here was
    // to enforce sub class to provide toString method
    public abstract String toString();

}