package day6.t6students;

import java.util.Map;

public class Student {
    private String lastName;
    private int groupNumber;
    private Map<String, Integer> map;

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public Student(String lastName, int groupNumber) {
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}
