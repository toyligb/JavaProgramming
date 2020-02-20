package home_tasks;

public class StarLogic {

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + ", ");
            if (i == 'g'){
                break;
            }
        }

        System.out.println("\n=============");

        char x = 'a';
        while (x >= 'z') {
            System.out.print(x);
            x++;
        }

        System.out.println("=======================");

        char y = 'a';
        do {
            System.out.println(y);
        } while (y >= 'z');

    }

}
