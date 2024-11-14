package test;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    // In-memory list to simulate a database
    private List<Student> students;

    public StudentDAO() {
        // Initializing the list with some sample data
        students = new ArrayList<>();
        students.add(new Student("Alice", 85.5f));
        students.add(new Student("Bob", 90.0f));
        students.add(new Student("Charlie", 78.0f));
    }

    // Method to find a student by name
    public Student findStudent(String studentName) {
        for (Student student : students) {
            if (student.getStudentName().equalsIgnoreCase(studentName)) {
                return student; // Return the found student
            }
        }
        return null; // Return null if not found
    }
}