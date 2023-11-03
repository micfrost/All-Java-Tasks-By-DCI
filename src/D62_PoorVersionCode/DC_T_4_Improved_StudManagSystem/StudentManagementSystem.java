package D62_PoorVersionCode.DC_T_4_Improved_StudManagSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {
    private Map<Integer, Student> students = new HashMap<>();
    private int studentIdCounter = 100000;

    public void addStudent(String name, LocalDate dateOfBirth) {
        int studentId = studentIdCounter++;
        Student student = new Student(name, dateOfBirth, studentId);
        students.put(studentId, student);
        System.out.println("Student added successfully with ID: " + studentId);
    }

    public void removeStudent(int studentId) {
        if (students.containsKey(studentId)) {
            Student student = students.get(studentId);
            System.out.print("Confirm removal of " + student.getName() + " (yes/no): ");
            Scanner scanner = new Scanner(System.in);
            String confirmation = scanner.nextLine().toLowerCase();
            if (confirmation.equals("yes")) {
                students.remove(studentId);
                System.out.println("Student removed successfully!");
            } else {
                System.out.println("Removal canceled.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    public void listStudents() {
        System.out.println("Student List:");
        for (Student student : students.values()) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Date of Birth: " + student.getDateOfBirth());
            System.out.println("Courses and Grades: " + student.getCourses().getCourseGrades());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        boolean isExit = false;
        while (!isExit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case MenuOption.ADD_STUDENT:
                    System.out.print("Enter the student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the date of birth (yyyy-MM-dd): ");
                    String birthDateStr = scanner.nextLine();
                    LocalDate birthDate = parseDate(birthDateStr);
                    sms.addStudent(name, birthDate);
                    break;
                case MenuOption.ADD_GRADE:
                    System.out.print("Enter the student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    if (sms.students.containsKey(studentId)) {
                        Student student = sms.students.get(studentId);
                        System.out.print("Enter the course: ");
                        String course = scanner.nextLine();
                        System.out.print("Enter the grade: ");
                        int grade = scanner.nextInt();
                        student.getCourses().addCourseGrade(course, grade);
                        System.out.println("Grade added successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case MenuOption.REMOVE_STUDENT:
                    System.out.print("Enter the student ID to remove: ");
                    int studentIdToRemove = scanner.nextInt();
                    sms.removeStudent(studentIdToRemove);
                    break;
                case MenuOption.LIST_STUDENTS:
                    sms.listStudents();
                    break;
                case MenuOption.EXIT:
                    isExit = true;
                    scanner.close();
                default:
                    System.out.println("Invalid selection. Please choose a valid operation.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Select an operation:");
        System.out.println(MenuOption.ADD_STUDENT + ". Add a student");
        System.out.println(MenuOption.ADD_GRADE + ". Add a course and grade");
        System.out.println(MenuOption.REMOVE_STUDENT + ". Remove a student");
        System.out.println(MenuOption.LIST_STUDENTS + ". List students");
        System.out.println(MenuOption.EXIT + ". Exit");
    }

    private static LocalDate parseDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateStr, formatter);
    }

    private static class MenuOption {
        static final int ADD_STUDENT = 1;
        static final int ADD_GRADE = 2;
        static final int REMOVE_STUDENT = 3;
        static final int LIST_STUDENTS = 4;
        static final int EXIT = 5;
    }
}