import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class Student {
    private String name;
    private double gpa;
    private boolean isGraduated;

    public Student(String name, double gpa, boolean isGraduated) {
        this.name = name;
        this.gpa = gpa;
        this.isGraduated = isGraduated;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", gpa=" + gpa +
               ", isGraduated=" + isGraduated +
               '}';
    }
}

public class PredicateFunctionUnaryOperatorExercise {
    public static void main(String[] args) {
        // Sample list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.8, true));
        students.add(new Student("Maya", 3.5, false));
        students.add(new Student("Bob", 3.9, true));
        students.add(new Student("David", 3.2, false));

        // Objective 1: Filter Students
        Predicate<Student> graduatedFilter = student -> student.isGraduated();
        List<Student> filteredGraduatedStudents = filterStudents(students, graduatedFilter);
        System.out.println("Filtered Graduated Students: " + filteredGraduatedStudents);

        // Objective 2: Transform Student Names
        Function<Student, String> transformStudentNames = student -> {
            if (student.isGraduated()) {
                return student.getName() + " (Graduated)";
            } else {
                return student.getName();
            }
        };
        List<String> transformedNames = transformStudentNames(students, transformStudentNames);
        System.out.println("Transformed Student Names: " + transformedNames);

        // Objective 3: Modify Student GPAs
        UnaryOperator<Double> increaseGpa = gpa -> gpa + 0.5;
        List<Student> modifiedStudents = modifyStudentGPAs(students, increaseGpa);
        System.out.println("Modified Student GPAs: " + modifiedStudents);
    }

    // Objective 1: Filter Students
    public static List<Student> filterStudents(List<Student> students, Predicate<Student> filter) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (filter.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    // Objective 2: Transform Student Names
    public static List<String> transformStudentNames(List<Student> students, Function<Student, String> transform) {
        List<String> transformedNames = new ArrayList<>();
        for (Student student : students) {
            transformedNames.add(transform.apply(student));
        }
        return transformedNames;
    }

    // Objective 3: Modify Student GPAs
    public static List<Student> modifyStudentGPAs(List<Student> students, UnaryOperator<Double> modifier) {
        List<Student> modifiedStudents = new ArrayList<>();
        for (Student student : students) {
            double modifiedGpa = modifier.apply(student.getGpa());
            modifiedStudents.add(new Student(student.getName(), modifiedGpa, student.isGraduated()));
        }
        return modifiedStudents;
    }
}
