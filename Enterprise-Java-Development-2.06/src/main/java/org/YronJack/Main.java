package org.YronJack;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Student Management System ===\n");

        // Create a Map with String key and Student value
        Map<String, Student> studentMap = new HashMap<>();

        // Create 4 Student objects for classmates
        Student alice = new Student("Alice Johnson", 85);
        Student bob = new Student("Bob Smith", 78);
        Student charlie = new Student("Charlie Brown", 92);
        Student diana = new Student("Diana Wilson", 88);

        // Add students to the map using their names as keys
        studentMap.put(alice.getName(), alice);
        studentMap.put(bob.getName(), bob);
        studentMap.put(charlie.getName(), charlie);
        studentMap.put(diana.getName(), diana);

        // Display original students
        System.out.println("ORIGINAL STUDENTS:");
        StudentManager.displayStudents(studentMap);
        StudentManager.displayStatistics(studentMap);

        // Increase grades by 10%
        System.out.println("\n" + "=".repeat(50));
        System.out.println("INCREASING GRADES BY 10%...");

        Map<String, Student> updatedMap = StudentManager.increaseGrades(studentMap);

        // Display updated students
        System.out.println("\nUPDATED STUDENTS:");
        StudentManager.displayStudents(updatedMap);
        StudentManager.displayStatistics(updatedMap);

        // Demonstrate edge cases
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TESTING EDGE CASES:");

        // Test with student having grade near 100
        Student highGradeStudent = new Student("Eva Martinez", 95);
        System.out.println("Before increase: " + highGradeStudent);
        highGradeStudent.increaseGradeByPercentage(10.0);
        System.out.println("After 10% increase: " + highGradeStudent + " (capped at 100)");

        // Test with student having low grade
        Student lowGradeStudent = new Student("Frank Davis", 45);
        System.out.println("\nBefore increase: " + lowGradeStudent);
        lowGradeStudent.increaseGradeByPercentage(10.0);
        System.out.println("After 10% increase: " + lowGradeStudent);

        // Demonstrate map operations
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MAP OPERATIONS DEMO:");

        // Search for a specific student
        String searchName = "Alice Johnson";
        if (updatedMap.containsKey(searchName)) {
            Student found = updatedMap.get(searchName);
            System.out.printf("Found student: %s%n", found);
        } else {
            System.out.printf("Student '%s' not found%n", searchName);
        }

        // Remove a student
        System.out.println("\nRemoving Bob Smith...");
        Student removed = updatedMap.remove("Bob Smith");
        if (removed != null) {
            System.out.printf("Removed: %s%n", removed);
        }

        System.out.println("\nFinal student list:");
        StudentManager.displayStudents(updatedMap);

        // Demonstrate iteration over map
        System.out.println("\nAll student names:");
        updatedMap.keySet().forEach(name -> System.out.println("- " + name));
    }
}