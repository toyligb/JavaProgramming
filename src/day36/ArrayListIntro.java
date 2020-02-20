package day36;

import java.util.*;

public class ArrayListIntro {

    // How do we create an ArrayList Object

    ArrayList<String> list1 = new ArrayList<>();
    // IT WILL ONLY STORE OBJECT!!! NOT PRIMITIVE
    // ArrayList<int> list2 = new ArrayList<>(); -->> yalnish

    // Correct way to create arraylist object that store whole number
    // is to use Wrapper class type. Primitive type is FORBIDDEN

    ArrayList<Integer> list2 = new ArrayList<>(); // new ArrayList<Integer>();

    ArrayList<Boolean> list3 = new ArrayList<>();

    ArrayList<Double> list4 = new ArrayList<>();

    // OPTIONALLY YOU CAN CREATE IN THIS WAY

    // List is a more general data type compared to ArrayList is more concrete data type
    // ArrayList is one type List
    // Just like Dog is one type of Animal
    List<String> myList = new ArrayList<>();

}
