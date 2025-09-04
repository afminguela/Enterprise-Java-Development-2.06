package org.YronJack;
import java.util.*;

/**
 * Student class representing a student with name and grade (0-100)
 */
public class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Use setter for validation
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {

        if (grade < 0) {
            this.grade = 0;
        } else if (grade > 100) {
            this.grade = 100;
        } else {
            this.grade = grade;
        }
    }


    public void increaseGradeByPercentage(double percentage) {
        int newGrade = (int) Math.round(this.grade * (1 + percentage / 100.0));
        setGrade(newGrade); // Use setter for validation
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', grade=%d}", name, grade);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
