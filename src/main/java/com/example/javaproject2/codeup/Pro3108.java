package com.example.javaproject2.codeup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pro3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeStudent(String code, String testId, String name){
        return new Student(code, testId, name);
    }

    public boolean isDuplicated(Student student){
        return students.stream().anyMatch(s -> s.equals(student));
    }

    public void addStudent(Student student){
        if(!isDuplicated(student)){
            students.add(student);
        }
    }

    public void printStudents(){
        for(Student student : students){
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }
    public static void main(String[] args) {
        Pro3108 pro3108 = new Pro3108();
        pro3108.addStudent(pro3108.makeStudent("123", "id1", "a"));
        pro3108.printStudents();
    }
}
class Student{
    private String code;
    private String testId;
    private String name;

    public Student(String code, String testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(code, student.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }


}
