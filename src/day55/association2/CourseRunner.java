package day55.association2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        List<String> lst =
           new ArrayList<>(Arrays.asList("Muge", "Sumeyye", "Hasan", "Kerim", "Dursun", "Jemal"));
        Course c1 = new Course("Gujurly Nesil", lst);
        System.out.println("Course list before adding new = " + c1);

        c1.addStudent("Muhammed");
        c1.addStudent("Gail");

        c1.addMultiple(Arrays.asList("Serife", "Israfil", "Beza"));

//        c1.studentNames.add("Toyly");
//        c1.studentNames.add("Merdan");
//        c1.studentNames.add("Ayjeren");
//        c1.studentNames.add("Ayse");
//        c1.studentNames.addAll(Arrays.asList("Serife", "Israfil", "Beza"));

        System.out.println("Course st.name = " + c1.studentNames);
        System.out.println("Course list after adding new = " + lst);

    }

}
