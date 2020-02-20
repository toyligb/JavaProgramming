package day39;

import java.util.*;

public class StudentCreation {

    public static void main(String[] args) {

        // how do we create an object out of template
        Student s1 = new Student();
        // set the values for s1 object attribute
        s1.name = "Karima";
        s1.age = 18;
        s1.gender = 'F';
        // get the values for s1 object attribute
        System.out.println("s1 name = " + s1.name);

        Student s2 = new Student();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';

        System.out.println("s2 age " + s2.age);
        int oldAge = s2.age;

        s2.age = 28;
        System.out.println(s2.name + " | " + s2.age + " | " + s2.gender);

        System.out.println("Juma's old age = " + oldAge);

        System.out.println("Difference bw ages = " + (oldAge - s2.age));

        /*
        * Variable types:
        * according to what kind of data it store:
        *       primitive variable -->> pure value
        *       reference variable -->>
        *                       the pointer to the object in the heap
        *                       the address of the object in the heap
        *                       remote of the TV
        *                       leash of the dog
        *
        * according to the location it shows up:
        *
        *       inside method -->> local variable
        *       inside ( ) of the method header -->> method parameter
        *
        *       outside method inside class -->> Field
        *                   -->> Field
        *                       instance field or instance variable
        *                       static field (will learn later)
         */

    }

}
