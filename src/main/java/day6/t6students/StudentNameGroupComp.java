package day6.t6students;

import java.util.Comparator;

public class StudentNameGroupComp implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getLastName().compareTo(s2.getLastName());

        if (result != 0)
            return result;

        return s1.getGroupNumber() - s2.getGroupNumber();

    }
}