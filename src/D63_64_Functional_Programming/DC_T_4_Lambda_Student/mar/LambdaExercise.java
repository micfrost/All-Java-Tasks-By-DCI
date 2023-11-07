package D63_64_Functional_Programming.DC_T_4_Lambda_Student.mar;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

@FunctionalInterface
interface Grader {
	String scoresInToGrades(int s);
}

public class LambdaExercise {
	static List<String> gradeStudents(List<Student> students) {

		Grader grader = (s) -> {
			if (s >= 90) return "A";
			if (s >= 80) return "B";
			if (s >= 70) return "C";
			if (s >= 60) return "D";
			return "F";
		};
		
		List<String> results = new ArrayList<>();
		
		for(Student student : students) {
			String grade = grader.scoresInToGrades(student.score);
			System.out.println("\nStudent: " + student.name + "\nGrade: " + grade);
			results.add("Student: " + student.name + "\nGrade: " + grade);
		}
		
		return results;

	}

	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<>();
		
		studentsList.add(new Student("Maria Ibanez", 85));
		studentsList.add(new Student("Adriana Ibanez", 75));
		studentsList.add(new Student("Daniel Nitzschke", 95));
		studentsList.add(new Student("Omar Ibanez", 78));
		studentsList.add(new Student("Maria Jose Rubio", 60));
		studentsList.add(new Student("Sofia Santana", 45));
		
		System.out.println("List of Students and Exam scores: ");
		studentsList.forEach(student -> {
			System.out.println("\nStudent: " + student.name + "\nExamen Score: " + student.score);
		});
		
		System.out.println("\n----------------------------");
		System.out.println("List of Students and Grades: ");
		gradeStudents(studentsList);
	}

}
