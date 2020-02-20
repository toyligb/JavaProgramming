package day50;

public class Addition extends Question {

    //    int num1;
    //    int num2;
    //    String operator;
    //    int answer;
    //    boolean calculated;
    //    String questionType = "Unknown";

    public Addition(int num1, int num2) {

        super("addition question", "+");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        answer = num1 + num2;
        // if you come to this point it means you called
        // the calculate method to calculate the result
        calculated = true;
    }

    @Override
    public String toString() {

        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Addition :  10+90 =
        if (calculated == true) {
            //return num1 + operator + num2 + " = " + answer;
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            //return num1 + operator + num2 + " = ";
            return super.toString() + num1 + operator + num2 + " = ";
        }
    }

}
