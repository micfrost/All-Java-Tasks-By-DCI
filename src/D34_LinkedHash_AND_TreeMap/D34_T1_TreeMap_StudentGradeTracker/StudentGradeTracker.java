package D34_LinkedHash_AND_TreeMap.D34_T1_TreeMap_StudentGradeTracker;
import java.util.*;

public class StudentGradeTracker {

    Scanner scanner = new Scanner(System.in);
    TreeMap<Integer, Student> studentGradesMap = new TreeMap<>();
    public void userInterface() {
        System.out.println("- - - - - ");
        System.out.println("Student Grade Tracker");
        System.out.println("A student grade tracker application that allows users to input and manage student grades for different courses.");
        String chosenOption;
        do {
            menu();
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case "1" -> addStudent();
                case "2" -> lookUpStudent();
                case "3" -> displayAllStudent();
                case "4" -> exit();
                default -> tryOneMoreTime();
            }
        } while (!chosenOption.equals("4"));
    }
    private void menu() {
        System.out.println("- - - - - ");
        System.out.println("Menu:");
        System.out.println("1. Add a Student.");
        System.out.println("2. Look up for a Student.");
        System.out.println("3. Display all Students Information.");
        System.out.println("4. Exit");
        System.out.println("- - - - - ");
        System.out.print("Enter selected option: ");
    }
    private void addStudent() {
        System.out.println("- - -");
        System.out.println("Enter a student's ID, name, grade for Math, IT, English - each input separated by a spaces: ");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");
        Integer K = Integer.valueOf(inputArray[0]);
        String V1 = inputArray[1];
        Double V2 = Double.valueOf(inputArray[2]);
        Double V3 = Double.valueOf(inputArray[3]);
        Double V4 = Double.valueOf(inputArray[4]);
        Double V5 = (V2+V3+V4)/3;
        studentGradesMap.put(K,new Student(V1, V2, V3, V4, V5));
        System.out.println("Students Id: " + K + studentGradesMap.get(K));
        System.out.println("Student added successfully.");
    }
    private void lookUpStudent() {
        System.out.println("- - -");
        System.out.println("Enter a Student's ID to display student's Information: ");
        Integer inputK = Integer.valueOf(scanner.nextLine());
        Student outputV = studentGradesMap.get(inputK);
        if(outputV != null) {
            System.out.println("Student's ID: " + inputK + ", " + outputV);
        }
        else {
            System.out.println("Student not found.");
        }
    }
    private void displayAllStudent() {
        System.out.println("- - - - - ");
        System.out.println("All Students: ");
        for(Map.Entry<Integer, Student> element: studentGradesMap.entrySet()){
            System.out.println("Student's ID: "  + element.getKey() + ", " + element.getValue());
        }
    }
    private void exit() {
        System.out.println("- - - - - ");
        System.out.println("The program was closed successfully.");
    }
    private void tryOneMoreTime() {
        System.out.println("- - - - - ");
        System.out.println("Try one more time.");
    }
}

