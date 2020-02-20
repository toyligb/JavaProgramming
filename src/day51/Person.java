package day51;

// Person IS-A Comparable
// Yes, because it implements Comparable interface
// it's a inheritance | IS-A | Super-Sub relationship
public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Person o) {
//        return 0;
//    }

    // now this become a natural order for comparing Person Object
    @Override
    public int compareTo(Person otherPerson) {

        // modify this to make your natural order, comparing by name

        if (this.name.charAt(0) > otherPerson.name.charAt(0)) {
            return 1;
        } else if (this.name.charAt(0) < otherPerson.name.charAt(0)) {
            return -1;
        } else {
            return 0;
        }

//        if (this.age > otherPerson.age) {
//            return 1;
//        } else if (this.age < otherPerson.age) {
//            return -1;
//        } else {
//            return 0;
//        }

    }
    // since String is Comparable itself it has method to already compare
    // 2 String objects , so we are just directly using it
//        return this.name.compareTo(otherPerson.name) ;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
