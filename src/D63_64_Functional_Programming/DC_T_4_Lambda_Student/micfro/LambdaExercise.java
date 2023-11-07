package D63_64_Functional_Programming.DC_T_4_Lambda_Student.micfro;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

    static List<String> gradeStudents(List<Student> inputList) {

        List<String> outputList = new ArrayList<>();

        inputList.forEach(student -> {
            String grade = null;
            if (student.getScore() >= 90) {
                grade = "A";
            } else if (student.getScore() >= 80) {
                grade = "B";
            } else if (student.getScore() >= 70) {
                grade = "C";
            } else if (student.getScore() >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            outputList.add(student.getName() + ", grade: " + grade);
        });
        return outputList;
    }

    public static void main(String[] args) {

        List<Student> inputList = new ArrayList<>();
        inputList.add(new Student("John", 88));
        inputList.add(new Student("Katie", 68));
        inputList.add(new Student("Patrycja", 32));

        System.out.println("- - -");
        System.out.println("The original list of students (name and score).");
        inputList.forEach(System.out::println);

        System.out.println("- - - ");
        System.out.println("The assigned grades for each student (name and grade).");
        List<String> outputList = gradeStudents(inputList);
        outputList.forEach(System.out::println);
    }
}
