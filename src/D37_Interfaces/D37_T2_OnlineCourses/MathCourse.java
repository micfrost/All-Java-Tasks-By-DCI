package D37_Interfaces.D37_T2_OnlineCourses;

import java.util.*;

public class MathCourse implements OnlineCourse {

//    PRIVATE AND FINAL (WITHOUT GETTER AND SETTER - SO IT'S NOT POSSIBLE TO SET, CHANGE IT)
    private final  String courseName;
    private final  String instructorName;
    private final  List<String> enrolledStudentsList;

    public MathCourse(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.enrolledStudentsList = new ArrayList<>();
    }

    @Override
    public void enrollStudent(String studentName) {

        enrolledStudentsList.add(studentName);
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course name: " + courseName + ".");
        System.out.println("Instructor name: " + instructorName + ".");
        System.out.println("Enrolled students: ");
        int studentNo=1;
        for (String student : enrolledStudentsList) {
            System.out.println("Student NO." + studentNo + ": "+ student +".");
            studentNo++;
        }


    }
}
