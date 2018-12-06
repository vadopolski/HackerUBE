package day6.t6students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> ivanovMarks= new HashMap<>();
        ivanovMarks.put("Math", 5);
        ivanovMarks.put("Bio", 4);

        Student ivanov = new Student("Ivanov", 5);
        ivanov.setMap(ivanovMarks);

        Map<String, Integer> petrovMarks = new HashMap<>();
        petrovMarks.put("Math", 3);
        petrovMarks.put("Data Structure", 5);

        Student petrov = new Student("Petrov", 3);
        petrov.setMap(petrovMarks);

        Map<String, Integer> sidorovMarks = new HashMap<>();
        sidorovMarks.put("Math", 5);
        sidorovMarks.put("Data Structure", 5);

        Student sidorov = new Student("Sidorov", 2);
        sidorov.setMap(sidorovMarks);

        Map<String, Integer> sidorov2Marks = new HashMap<>();
        sidorov2Marks.put("Math", 4);
        sidorov2Marks.put("Data Structure", 4);

        Student sidorov2 = new Student("Sidorov", 5);
        sidorov.setMap(sidorov2Marks);

        Faculty faculty = new Faculty("Applied Math");
        List<Student> students = new ArrayList<>();
        students.add(ivanov);
        students.add(petrov);
        students.add(sidorov);
        students.add(sidorov2);
        faculty.setStudents(students);
        faculty.printStudentByMark();
    }

}
