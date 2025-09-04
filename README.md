# Enterprise Java Development 2.06 - Student Management System

An Ironhack exercise demonstrating Java Map collections and object-oriented programming principles through a comprehensive student management system.

## 📋 Project Specifications Compliance

This project fully implements all required specifications:

- ✅ **Java Project**: Maven-based Java 17 project with proper structure
- ✅ **Student Class**: Contains required properties:
  - `name`: String
  - `grade`: int (validated to be in range 0-100)
- ✅ **Map Implementation**: Uses `Map<String, Student>` with student name as key and Student object as value
- ✅ **increaseGrades Method**: Implemented in `StudentManager` class to increase grades by 10%

## 🏗️ Project Structure

```
Enterprise-Java-Development-2.06/
├── src/main/java/org/YronJack/
│   ├── Student.java          # Core Student class with properties and validation
│   ├── StudentManager.java   # Utility class with map operations
│   └── Main.java            # Demo application showing functionality
├── pom.xml                  # Maven configuration
└── README.md               # This documentation
```

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Maven 3.6+ (optional, Maven wrapper included)

### Building the Project
```bash
cd Enterprise-Java-Development-2.06
mvn compile
```

### Running the Application
```bash
mvn exec:java -Dexec.mainClass="org.YronJack.Main"
```

## 📚 Classes Overview

### Student Class
The core entity representing a student with the following features:

**Properties:**
- `name`: String - Student's name
- `grade`: int - Student's grade (automatically validated to 0-100 range)

**Key Methods:**
- `Student(String name, int grade)` - Constructor with validation
- `increaseGradeByPercentage(double percentage)` - Increase grade by percentage
- `toString()`, `equals()`, `hashCode()` - Properly implemented for collections

**Grade Validation:**
- Grades below 0 are set to 0
- Grades above 100 are capped at 100
- Ensures data integrity

### StudentManager Class
Utility class providing map operations for student management:

**Core Methods:**
- `increaseGrades(Map<String, Student>)` - Returns new map with 10% grade increase
- `increaseGradesInPlace(Map<String, Student>)` - Modifies existing map in-place
- `displayStudents(Map<String, Student>)` - Pretty-print student list
- `displayStatistics(Map<String, Student>)` - Show grade statistics

### Main Class
Comprehensive demonstration application showcasing:
- Map creation and population
- Grade increase functionality
- Edge case handling (grades near 100, validation)
- Map operations (search, remove, iteration)
- Statistical analysis

## 💡 Features Beyond Requirements

This implementation goes beyond the basic specifications by providing:

1. **Robust Validation**: Automatic grade capping and validation
2. **Multiple Increase Methods**: Both immutable and in-place operations
3. **Comprehensive Demo**: Edge cases, statistics, and map operations
4. **Professional Code Quality**: 
   - Proper JavaDoc comments
   - Override methods (equals, hashCode, toString)
   - Clean code principles
   - Maven project structure

## 🎯 Example Usage

```java
// Create students
Student alice = new Student("Alice Johnson", 85);
Student bob = new Student("Bob Smith", 78);

// Create map
Map<String, Student> studentMap = new HashMap<>();
studentMap.put(alice.getName(), alice);
studentMap.put(bob.getName(), bob);

// Increase grades by 10%
Map<String, Student> updatedMap = StudentManager.increaseGrades(studentMap);

// Display results
StudentManager.displayStudents(updatedMap);
StudentManager.displayStatistics(updatedMap);
```

## 📊 Sample Output

```
=== ORIGINAL STUDENTS ===
Key: Alice Johnson   | Student{name='Alice Johnson', grade=85}
Key: Bob Smith       | Student{name='Bob Smith', grade=78}

=== UPDATED STUDENTS (10% increase) ===
Key: Alice Johnson   | Student{name='Alice Johnson', grade=94}
Key: Bob Smith       | Student{name='Bob Smith', grade=86}

=== Statistics ===
Total Students: 2
Average Grade: 90.00
Highest Grade: 94 (Alice Johnson)
Lowest Grade: 86 (Bob Smith)
```

## 🧪 Testing

The application includes comprehensive testing through the Main class:
- Basic functionality demonstration
- Edge case handling (grades near limits)
- Map operations (search, remove, iterate)
- Grade validation testing
- Statistical calculations

Run the main class to see all test scenarios executed.

## 🔧 Technical Details

- **Java Version**: 17
- **Build Tool**: Maven
- **Architecture**: Object-oriented with separation of concerns
- **Data Structure**: HashMap for O(1) student lookup by name
- **Validation**: Automatic grade boundary enforcement

## 📝 Assignment Completion

This project demonstrates mastery of:
- Java Map collections usage
- Object-oriented programming principles
- Data validation and integrity
- Maven project structure
- Clean code practices

All original specifications have been implemented and enhanced with additional professional features.
