package org.YronJack;

import java.util.HashMap;
import java.util.Map;

class StudentManager {

    /**
     * Increases every student's grade by 10% and returns the updated map
     * @param studentMap Map containing student name as key and Student object as value
     * @return Updated map with increased grades
     */
    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        // Create a new map to avoid modifying the original if needed
        Map<String, Student> updatedMap = new HashMap<>();

        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            String studentName = entry.getKey();
            Student student = entry.getValue();

            // Create a copy of the student to avoid modifying original
            Student updatedStudent = new Student(student.getName(), student.getGrade());
            updatedStudent.increaseGradeByPercentage(10.0); // Increase by 10%

            updatedMap.put(studentName, updatedStudent);
        }

        return updatedMap;
    }

    /**
     * Alternative method that modifies the existing map in-place
     */
    public static Map<String, Student> increaseGradesInPlace(Map<String, Student> studentMap) {
        for (Student student : studentMap.values()) {
            student.increaseGradeByPercentage(10.0);
        }
        return studentMap;
    }

    /**
     * Display all students in the map
     */
    public static void displayStudents(Map<String, Student> studentMap) {
        System.out.println("\n=== Student List ===");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.printf("Key: %-15s | %s%n", entry.getKey(), entry.getValue());
        }
    }

    /**
     * Get student statistics
     */
    public static void displayStatistics(Map<String, Student> studentMap) {
        if (studentMap.isEmpty()) {
            System.out.println("No students in the map.");
            return;
        }

        int totalGrades = 0;
        int maxGrade = Integer.MIN_VALUE;
        int minGrade = Integer.MAX_VALUE;
        String topStudent = "";
        String bottomStudent = "";

        for (Student student : studentMap.values()) {
            int grade = student.getGrade();
            totalGrades += grade;

            if (grade > maxGrade) {
                maxGrade = grade;
                topStudent = student.getName();
            }

            if (grade < minGrade) {
                minGrade = grade;
                bottomStudent = student.getName();
            }
        }

        double averageGrade = (double) totalGrades / studentMap.size();

        System.out.println("\n=== Statistics ===");
        System.out.printf("Total Students: %d%n", studentMap.size());
        System.out.printf("Average Grade: %.2f%n", averageGrade);
        System.out.printf("Highest Grade: %d (%s)%n", maxGrade, topStudent);
        System.out.printf("Lowest Grade: %d (%s)%n", minGrade, bottomStudent);
    }
}
