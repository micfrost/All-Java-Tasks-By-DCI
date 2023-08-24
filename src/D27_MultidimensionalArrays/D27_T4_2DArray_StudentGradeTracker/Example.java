package D27_MultidimensionalArrays.D27_T4_2DArray_StudentGradeTracker;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxStudents = 10;
        int maxSubjects = 5;

        String[][] studentData = new String[maxStudents][maxSubjects + 1];  // +1 for student name

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudentData(scanner, studentData);
                    break;
                case 2:
                    calculateAverageGrades(studentData);
                    break;
                case 3:
                    displayStudentGrades(studentData);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 4);
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add student's name and grades");
        System.out.println("2. Calculate average grades");
        System.out.println("3. Display student names and average grades");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void addStudentData(Scanner scanner, String[][] studentData) {
        System.out.print("Enter student's name: ");
        String name = scanner.next();

        for (int i = 0; i < studentData.length; i++) {
            if (studentData[i][0] == null) {
                studentData[i][0] = name;
                System.out.println("Enter " + name + "'s grades for " + (studentData[i].length - 1) + " subjects:");
                for (int j = 1; j < studentData[i].length; j++) {
                    System.out.print("Enter grade for subject " + j + ": ");
                    studentData[i][j] = Integer.toString(scanner.nextInt());
                }
                System.out.println("Student data added.");
                return;
            }
        }
        System.out.println("Maximum number of students reached.");
    }

    public static void calculateAverageGrades(String[][] studentData) {
        for (int i = 0; i < studentData.length; i++) {
            if (studentData[i][0] != null) {
                int totalGrades = 0;
                int numGrades = 0;
                for (int j = 1; j < studentData[i].length; j++) {
                    if (studentData[i][j] != null) {
                        totalGrades += Integer.parseInt(studentData[i][j]);
                        numGrades++;
                    }
                }
                double average = (double) totalGrades / numGrades;
                System.out.println("Average grade for " + studentData[i][0] + ": " + average);
            }
        }
    }

    public static void displayStudentGrades(String[][] studentData) {
        for (int i = 0; i < studentData.length; i++) {
            if (studentData[i][0] != null) {
                System.out.print(studentData[i][0] + "'s grades: ");
                for (int j = 1; j < studentData[i].length; j++) {
                    if (studentData[i][j] != null) {
                        System.out.print(studentData[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
