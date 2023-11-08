package D65_Predicate_Function_Unary.DC_T_2_Predicate_Function_Unary.micfro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    //  Task 1: Filter Students

//    Works but butter to use test instead of removeIt
//    public static List<Student> filterStudents2(List<Student> studentList, Predicate<Student> filter) {
//        List<Student> filteredStudentList = new ArrayList<>();
//        filteredStudentList = studentList;
//        filteredStudentList.removeIf(filter);
//        return filteredStudentList;
//    }

    public static List<Student> filterStudents(List<Student> studentList, Predicate<Student> predicate) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (predicate.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }


    //  Task 2: Transform Student Names
    public static List<Student> transfromStudent(List<Student> studentList, Function<Student, String> functionTansform) {
        studentList.forEach(student -> student.name = functionTansform.apply(student));
        return studentList;
    }

    //  Task 3: Modify Student GPAs
    public static List<Student> modifyStudent(List<Student> studentList, UnaryOperator<Double> unaryModify) {
        studentList.forEach(student -> student.dpa = unaryModify.apply(student.dpa));
        return studentList;
    }


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Michal Frost", 5.0, true, true),
                new Student("Julian Frost", 6.0, true, false),
                new Student("Aleksa Frost", 4.5, false, false),
                new Student("Tomas Rocker", 2.5, false, false)
        ));

//  Original List
        System.out.println("- - -");
        System.out.println("Original List");
        studentList.forEach(name -> {
            System.out.println(name);
        });

//  Task 1: Filter Students
        System.out.println("- - -");
        System.out.println("Filtered List. Enrolled students");
        List<Student> filteredStudents = filterStudents(studentList, student -> student.isEnroll);
        filteredStudents.forEach(System.out::println);

//  Task 2: Transform Student Names
        System.out.println("- - - ");
        System.out.println("Transformed List");
        List<Student> transformedStudentList = transfromStudent(studentList, student -> student.isGraduated()
                ? student.getName() + " (Graduated)"
                : student.getName());
        transformedStudentList.forEach(System.out::println);

//  Task 3: Modify Student GPAs
        System.out.println("- - - ");
        System.out.println("Modified List");
        List<Student> modifiedStudentList = modifyStudent(studentList, gpa -> gpa + 7.0);
        modifiedStudentList.forEach(System.out::println);

    }

}