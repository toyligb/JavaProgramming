package zReplit;

public class Task187_MethodsWithString10_LameDB {

    public static void main(String[] args) {

        System.out.print(lameDb("1tst#2bla#3foo", "add", "4", "aaa") + "\n");
        System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");
        System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");
        System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");
    }

    private static String lameDb(String db, String op, String id, String data) {

        String result = "";
        String[] arr = db.split("#");
        return result;


    }

}
