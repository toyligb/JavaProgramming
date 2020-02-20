package zReplit;

public class Task091Letters {
    public static void main(String[] args) {
         /*
    * Write a loop that displays all possible combinations of two letters where
    * the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
    * The combinations should be displayed in descending alphabetical order:
            zz   zy
    */
        System.out.println("IJ");
        for (char i = 'A'; i <= 'Z'; i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                System.out.println("" + i + j);
            }
        }

    }

}
