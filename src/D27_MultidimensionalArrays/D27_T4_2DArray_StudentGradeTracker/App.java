package D27_MultidimensionalArrays.D27_T4_2DArray_StudentGradeTracker;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);

    public void run() {

        title();
        System.out.println("Enter a number of Students: ");
        int numStudents = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a number of Subjects: ");
        int numSubjects = Integer.valueOf(scanner.nextLine());


//        One more column with subjects for a name of student
        String[][] studentInfo = new String[numStudents][numSubjects + 1];

        int chosenOption;
        do {
            Menu();
            chosenOption = Integer.valueOf(scanner.nextLine());

            switch (chosenOption) {
                case 1:
                    addStudentNameAndGrades(studentInfo);
                    break;
                case 2:
                    averageGrade(studentInfo);
                    break;
                case 3:
                    displayAllStudents(studentInfo);
                    break;
                case 4:
                    System.out.println("Closing the program");
                    break;
                default:
                    System.out.println("Try one more time.");
                    break;
            }
        } while (chosenOption != 4);
    }


    private void title() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Student Grade Tracker.");
        System.out.println("The program allows teachers to input student names and grades, calculate the average grade for each student, and display the student names along with their average grades.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    public static void Menu() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add all student's name and grades");
        System.out.println("2. Calculate average grades");
        System.out.println("3. Display student names and average grades");
        System.out.println("4. End");
        System.out.print("Enter what you want to do: ");
    }

    private void addStudentNameAndGrades(String[][] studentInfo) {

        for (int i = 0; i < studentInfo.length; i++) {
            System.out.println("Add a name of a Student no.: " + (i + 1) + ": ");
            studentInfo[i][0] = this.scanner.nextLine();

            System.out.println("Add grades for " + (studentInfo[i].length - 1) + " subjects:");
            for (int j = 1; j < studentInfo[i].length; j++) {
                System.out.println("Add a grade for a subject no.: " + j + ": ");
                studentInfo[i][j] = String.valueOf(this.scanner.nextInt());
            }
            // Avoiding a problem with a new Line
            this.scanner.nextLine();
        }
        System.out.println(studentInfo.length + " Student's names and grades were added to an Database.");
    }

    private void averageGrade(String[][] studentInfo) {

        for (int i = 0; i < studentInfo.length; i++) {
            double everage;
            int sumOfGrades = 0;
            int numOfGrades = 0;
            for (int j = 1; j < studentInfo[i].length; j++) {
                sumOfGrades = sumOfGrades + Integer.parseInt(studentInfo[i][j]);
                numOfGrades++;
            }
            everage = 1.0 * sumOfGrades / numOfGrades;
        }
        System.out.println("Average grade was calculated perfectly.");
    }

    private void displayAllStudents(String[][] studentInfo) {

        for (int i = 0; i < studentInfo.length; i++) {
            double everage;
            int sumOfGrades = 0;
            int numOfGrades = 0;
            for (int j = 1; j < studentInfo[i].length; j++) {
                sumOfGrades = sumOfGrades + Integer.parseInt(studentInfo[i][j]);
                numOfGrades++;
            }
            everage = 1.0 * sumOfGrades / numOfGrades;
            System.out.println("Average grade for " + studentInfo[i][0] + " is : " + everage);
        }
    }
}



