package D37_Interfaces.D37_T2_OnlineCourses;

import java.util.*;

public class ProgrammingCourse implements OnlineCourse {


//   PRIVATE AND GETTER AND SETTER (NO FINAL) So It's possible to change .
    private  String courseName;
    private  String instructorName;
    private List<String> enrolledStudentsList;



    public ProgrammingCourse(String courseName, String instructorName) {
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
            System.out.println("Student No." + studentNo + ": "+ student +".");
            studentNo++;
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public List<String> getEnrolledStudentsList() {
        return enrolledStudentsList;
    }

    public void setEnrolledStudentsList(List<String> enrolledStudentsList) {
        this.enrolledStudentsList = enrolledStudentsList;
    }
}
