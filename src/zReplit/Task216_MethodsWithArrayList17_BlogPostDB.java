package zReplit;

import java.util.*;

public class Task216_MethodsWithArrayList17_BlogPostDB {

    public String blogDb(ArrayList<String[]> r, String id) {

        String result = "";
        for (String[] text : r) {
            if (text[0].equals(id)) {
                result = text[1] + "\n" + text[2];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Task216_MethodsWithArrayList17_BlogPostDB m = new Task216_MethodsWithArrayList17_BlogPostDB();
        ArrayList<String[]> arr = new ArrayList<String[]>();
        arr.add(new String[]{"1", "title 1", "content 1"});
        arr.add(new String[]{"2", "title 2", "content 2"});
        arr.add(new String[]{"3", "title 3", "content 3"});

        String post = m.blogDb(arr, "3");
        System.out.println(post);

    }

}
