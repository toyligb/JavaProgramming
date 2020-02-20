package office_hour;

class Pr_01_27_TestData {

    int a = 100;

    public Pr_01_27_TestData(int a) {
        System.out.println("A");
    }

    public void method1() {
        //   TestData obj = new TestData();
        System.out.println("super class instance methods");
    }

}

class Super_Keyword extends Pr_01_27_TestData {

    public Super_Keyword() {
        // super(); //A
        super(10);
        System.out.println("B");

    }

    public static void main(String[] args) {
        //  super.a = 300;
        // super.method1();
        //mm();

        Super_Keyword obj = new Super_Keyword();
        //  obj.mm2();

    }

    public void method1() {
        System.out.println("sub class instance methods");
    }

    public void mm() {
        System.out.println(super.a);  // calling instance variables from super
        super.method1();  // calling the instance methods from super class
    }

    public void mm2() {
        System.out.println(super.a);
        this.method1(); // calling instance methods from the current class
    }

}
