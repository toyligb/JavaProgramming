package day41;

public class Person {

    // private make it only accessible within the same class
    private String name; // onune private diyilen access modifier goysan bashga yerde ulanip bolmayar
    private int age;
    private long ssn;

    // What if I want to only get the name
    public String getName() {
        return name;
    }

    // What if I want to only change the name
    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long newSSN) {
        ssn = newSSN;
    }

    // write a method to give value to the field
    public void setAll(String newName, int newAge, long newSSN) {

        // You can put whatever check here to make sure
        // the data is correct or any other logic
        name = newName;
        age = newAge;
        ssn = newSSN;

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
