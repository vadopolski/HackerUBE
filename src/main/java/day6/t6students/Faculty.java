package day6.t6students;

import java.util.Arrays;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
    }

    public void printStudentByMark(){
        StudentNameComp comp = new StudentNameComp();
        System.out.println("Test");
        students.sort(comp);

        System.out.println(Arrays.toString(students.toArray()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}