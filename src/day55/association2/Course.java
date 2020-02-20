package day55.association2;

import java.util.List;

public class Course {

    String subject;
    // String[] studentNames; array bolany ucin fixed size bolyar
    List<String> studentNames;

    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }

    public void addStudent(String name) {
        studentNames.add(name);
    }

    public void addMultiple(List<String> many) {
        studentNames.addAll(many);
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
