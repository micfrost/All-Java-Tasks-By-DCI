package D37_Interfaces.D37_T2_OnlineCourses;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    List<OnlineCourse> onlineCourseList = new ArrayList<>();

    void addCourse(OnlineCourse onlineCourse) {
        onlineCourseList.add(onlineCourse);

    }

    void enrollStudentToCourse(String studentName, OnlineCourse onlineCourse) {
        onlineCourse.enrollStudent(studentName);

    }

    void displayAllCourseDetail() {
        for (OnlineCourse onlinecourse : onlineCourseList) {
            onlinecourse.displayCourseDetails();
            System.out.println("- - -");
        }


    }
}
