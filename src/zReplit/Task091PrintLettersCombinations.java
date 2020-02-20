package zReplit;

public class Task091PrintLettersCombinations {

    public static void main(String[] args) {

        for (char i = 'z'; i >= 'v'; i--) {
            for (char k = 'z'; k >= 'v'; k--) {
                System.out.println("" + i + k);
            }
        }

    }

}
