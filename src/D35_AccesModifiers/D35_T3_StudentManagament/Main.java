package D35_AccesModifiers.D35_T3_StudentManagament;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Student> studentHashMap = new HashMap<>();

        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent();
        undergraduateStudent1.setName("Bob");
        undergraduateStudent1.setStudentID(11);
        undergraduateStudent1.setYear(1);

        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent();
        undergraduateStudent2.setName("Tim");
        undergraduateStudent2.setStudentID(12);
        undergraduateStudent2.setYear(3);

        GraduateStudent graduateStudent1 = new GraduateStudent();
        graduateStudent1.setName("John");
        graduateStudent1.setStudentID(22);
        graduateStudent1.setResearchTopic("City and a Sky");

        GraduateStudent graduateStudent2 = new GraduateStudent();
        graduateStudent2.setName("King");
        graduateStudent2.setStudentID(23);
        graduateStudent2.setResearchTopic("Town and a field");

        studentHashMap.put(undergraduateStudent1.getStudentID(), undergraduateStudent1);
        studentHashMap.put(undergraduateStudent2.getStudentID(), undergraduateStudent2);

        studentHashMap.put(graduateStudent1.getStudentID(), graduateStudent1);
        studentHashMap.put(graduateStudent2.getStudentID(), graduateStudent2);

        System.out.println("Undergraduate Students:");
        for (Map.Entry<Integer, Student> element : studentHashMap.entrySet()) {
            Student student = element.getValue();
            if (student instanceof UndergraduateStudent) {
                System.out.println("Student ID: " + student.getStudentID());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Year: " + ((UndergraduateStudent) student).getYear());
                System.out.println();
            }
        }

        System.out.println("Graduate Students:");
        for (Map.Entry<Integer, Student> entry : studentHashMap.entrySet()) {
            Student student = entry.getValue();
            if (student instanceof GraduateStudent) {
                System.out.println("Student ID: " + student.getStudentID());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Research Topic: " + ((GraduateStudent)student).getResearchTopic());
                System.out.println();
            }
        }
    }
}