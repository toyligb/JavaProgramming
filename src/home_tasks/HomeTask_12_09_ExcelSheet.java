package home_tasks;

public class HomeTask_12_09_ExcelSheet {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (char j = 'A'; j <= 'D'; j++) {
                System.out.print("Cell(" + i + "," + j + ") ");
            }
            System.out.println();
        }

    }

}
